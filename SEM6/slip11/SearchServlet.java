import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String customernumber = request.getParameter("customer_number"); // Corrected typo: getParameter instead of getparameter

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // Corrected typo: ResultSet instead of Resultset

        try {
            Class.forName("org.postgresql.Driver"); // Corrected typo: forName instead of forname
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "1234"); // Corrected URL: jdbc:postgresql://localhost/postgres instead of jdbc:postgres://localhost/postgres

            pstmt = conn.prepareStatement("SELECT * FROM customer WHERE customer_number = ?");
            pstmt.setString(1, customernumber);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String customername = rs.getString("customer_name");
                String customer_address = rs.getString("customer_address");
                out.println("<html><body>");
                out.println("<h2>Customer Details:</h2>");
                out.println("<p>Customer number:" + customernumber + "</p>");
                out.println("<p>Customer Name" + customername + "</p>");
                out.println("<p>Customer Address" + customer_address + "</p>");
                out.println("</body></html>");
            } else {
                response.setContentType("text/html");
                out.println("<html><body>");
                out.println("<h2>Error</h2>");
                out.println("<p>Customer name not found!</p>");
                out.println("</body></html>");
            }
        } catch (ClassNotFoundException cnfe) {
            out.println("Driver not found!" + cnfe);
        } catch (SQLException sqle) {
            out.println("SQLException:" + sqle);
        } catch (Exception e) {
            out.println("Exception:" + e);
        } finally { // It's good practice to close resources in finally block
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException sqle) {
                out.println("Error closing resources:" + sqle);
            }
        }
    }
}
