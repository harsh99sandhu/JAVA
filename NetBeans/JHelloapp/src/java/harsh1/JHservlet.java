package harsh1; 
 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Date; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 

public class JHservlet extends HttpServlet 
{ 
 
    @Override     
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {         
        System.out.println("-----service-----");         
        PrintWriter out = response.getWriter();     
        out.println("Hello Friends" +" " + new Date());
        out.println("Harsh Sandhu");
        out.println("65");
        out.close();    
    }
} 