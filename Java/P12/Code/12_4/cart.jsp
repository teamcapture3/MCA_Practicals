<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String str1 = request.getParameter("item");
String str2 = request.getParameter("qty");
String str3 = request.getParameter("add");
String str4 = request.getParameter("list");
if(str3 != null)
{
	Cookie c1 = new Cookie(str1, str2);
	response.addCookie(c1);
	response.sendRedirect("index.html");
}
else if(str4 != null)
{

}
Cookie clientCookies[] = request.getCookies();
for( int i = 1; i < clientCookies.length; i++)
{
	out.print("<B>" + clientCookies[i].getName() + " : " + clientCookies[i].getValue() + "</B><BR>");
}
%>