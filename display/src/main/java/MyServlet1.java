import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
public class MyServlet1 extends HttpServlet{
public void doGet(HttpServletRequest request,  HttpServletResponse response) {
try{
response.setContentType("text/html");
PrintWriter pwriter = response.getWriter();
String name = request.getParameter("userName");
String id = request.getParameter("userid");
pwriter.print("Your Product is : "+name);
pwriter.print(" Your Product id is : "+id);
//Creating two cookies
Cookie c1=new Cookie("userName",name);
Cookie c2=new Cookie("userid",id);
//Adding the cookies to response header
response.addCookie(c1);
response.addCookie(c2);
pwriter.print("<a href='welcomehere'>View Details</a>");
pwriter.close();
}catch(Exception exp){
System.out.println(exp);
}
}
}