
<%@page import="java.io.IOException"%> 
<!--  This is XML style comment --> 
<%     
    System.out.println("--------index.jsp--------");     
    out.println("Welcome to JSP: "+new java.util.Date()); 
%> 
 
<br/> 
 
Server Time: <%=new java.util.Date()%> 
 
<%!     
static int count=0;         
void test(JspWriter out) throws IOException
{         
System.out.println("-------test()-------");         
out.println("<br/>Request Count to this JSP: "+count);     
} 
%> 
 
<%     
    count++;     
    test(out); 
%> 
 
 