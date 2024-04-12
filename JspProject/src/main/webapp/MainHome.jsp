<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@include file="Header.jsp" %>
<%@taglib tagdir="/WEB-INF/TagsFolder/intro.tag" prefix="t"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table {
	border: 20px  solid green;
	padding: 20px;
	margin: 10px;
}
</style>
<meta charset="ISO-8859-1">
<title>jsp main page</title>
</head>
<body>
<h3>This is h3 heading in main jsp page</h3>
<p>Facebook helps you connect and share with people you love</p>
<%!String name[]= new String[]{"chit","ban","anu"};%>

<%for(int i=0;i<name.length;i++)
	{%>
	<table>
	<tr>
	<td><%=name[i] %></td>
	</tr>
	</table>
	<%} 
	%>


</body>
</html>