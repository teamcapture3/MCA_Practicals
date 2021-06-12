<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%
int java=Integer.parseInt(request.getParameter("java"));
int OR=Integer.parseInt(request.getParameter("or"));
int DBMS=Integer.parseInt(request.getParameter("dbms"));
int IS=Integer.parseInt(request.getParameter("is"));
int STL=Integer.parseInt(request.getParameter("stl"));
int c=java+OR+DBMS+IS+STL;
double avg=c/5;
if(avg > 90 ){
out.println(" your grade is A");
}else if (avg >= 80) {
out.println("your grade is B");
} else if (avg >= 70) {
out.println("your grade is C");
} else if (avg >= 60) {
out.println("your grade is D");
} else {
out.println("your grade is E");
}
%>
