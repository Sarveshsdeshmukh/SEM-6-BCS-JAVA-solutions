import java.sql.*;

public class emp {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            if (args.length == 1) {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:localhost/postgres", "postgres", "1234");
                pstmt = conn.prepareStatement("DELETE FROM emp WHERE id=?");
                pstmt.setInt(1, Integer.parseInt(args[0]));
                int ans = pstmt.executeUpdate();

                if (ans == 0) {
                    System.out.println("Employee with the given id not found.");
                } else {
                    System.out.println("Employee with the given id deleted successfully.");
                }
            } else {
                System.out.println("No employee ID provided.");
            }
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error: " + cnfe);
        } catch (SQLException sqle) {
            System.out.println("Error: " + sqle);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                System.out.println("Error: " + se);
            }
        }
    }
}
