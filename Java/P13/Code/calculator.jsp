<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<%@page language="java"%>
<%
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
String operation = request.getParameter("r1");
if(operation.equals("Add"))
{
	int add=num1+num2;
	out.println("Addition is: "+add);
}
else if(operation.equals("Sub"))
{
	int sub=num1-num2;
	out.println("Substraction is: "+sub);
}
else if(operation.equals("mul"))
{
	int mul=num1*num2;
	out.println("Multiplication is: "+mul);
}
else if(operation.equals("div"))
{
	int div = num1/num2;
	if(num1>=num2)
		out.println("division is: "+div);
	else
		out.println("The division cannot beperformed");
}
%>
</body>
</html>
