import java.io.*
import java.util.*;
import javax.Servlet.*;
import javax.Servlet.Http.*;

public class ServletInfo extends HttpServlet{
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException , IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ip = request.getRemoteAddr();
        String browsertype = request.getHeader('User-Agent');

        String ServerInfo = getServletContext().getServerInfo();
        String os = System.getProperty("os.name");

        Enumeration<String> servletNames = getServeltContext().getServletNames();

        out.println("<Html>");
        out.println("<head><title>Server info</title></head>");
        out.println("<body>");
        out.println("<h1>Information</h1>");
        out.println("<h1>IP Address"+ip+"</h1>"); 
        out.println("<h1>IP Address"+User Browser+"</h1>"); 
        out.println("<h1>IP Address"+ServerInfo+"</h1>"); 
        out.println("<h1>IP Address"+os+"</h1>"); 

        out.println("Loaded Servlets:");

        out.println("<ul>");

        while(servletNames.hasNextElement()){
            String servletName = servletNames.nextElement();
            System.out.println(servletName);
        }
        out.println("</ul>");
        out.println("</body></html>")
        
    }
}
