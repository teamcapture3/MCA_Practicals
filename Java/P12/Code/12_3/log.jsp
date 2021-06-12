<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IP Logger</title>
</head>
<body>
<h3>IP logger</h3>
<hr>
<h5>
<%   	String ip = request.getHeader("X-Forwarded-For"); 
		Date date = new Date();
		String time = date.toString();
		
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
            ip = request.getHeader("Proxy-Client-IP");  
        }  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
            ip = request.getHeader("WL-Proxy-Client-IP");  
        }  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
            ip = request.getHeader("HTTP_CLIENT_IP");  
        }  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");  
        }  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
            ip = request.getRemoteAddr();  
        }
        out.print( "Your ip:"+ip+"<br> Your visiting time:"+time+"<br><br>");
        
        %>
</h5> 
        <%
        ArrayList<String> ip_list = (ArrayList<String>)application.getAttribute("ip_address");
        ArrayList<String> time_list = (ArrayList<String>)application.getAttribute("ip_log_time");	
        if(ip_list==null){
        	ArrayList<String> niplist = new ArrayList<String>();
        	niplist.add(ip);
        	application.setAttribute("ip_address", niplist);	
        	ArrayList<String> niptimelist = new ArrayList<String>();
        	niptimelist.add(time);
        	application.setAttribute("ip_log_time", niptimelist);
        }
        else{
        	ip_list.add(ip);
        	time_list.add(time);
        	
        	application.setAttribute("ip_address", ip_list);
        	application.setAttribute("ip_log_time", time_list);
        	out.println("<br>"+
        					"<table>"+
        						"<tr><th>IP</th><th></th><th>Time</th></tr>");
        	for(int i=0;i<ip_list.size();i++){
        		out.println("<tr><td>"+ip_list.get(i)+"</td><td>|</td><td>"+time_list.get(i)+"</td></tr>");
        	}
        }
        %>
</body>
</html>
