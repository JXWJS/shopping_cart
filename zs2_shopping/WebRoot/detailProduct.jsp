<%@ include file="header.jsp" %>
<%@ include file="footer.jsp" %>
<%@page import="entity.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品详细</title>
</head>
<body>
<h1><%--(Product)session.getAttribute("product") --%></h1>

<%
	Product product=(Product)session.getAttribute("product");
 %>
 

 <hr>
 
 <center>
 <table>
 	<tr>
 		<td><img
src="<%=product.getPicUrl() %>" width="500px" height="500px"
border="0" /></td>

		
	</tr>
 	<tr>
 		<td><h1>商品名:<%=product.getName() %></h1></td>
 	</tr>
 	<tr>
 		<td><h2>单价:<%=product.getPrice() %></h2></td>
 	</tr>
 	
 	<tr>
 		<td><h2>点评:<%=product.getComment() %></h2></td>
 	</tr>
 	
 	</table>
</center>
</body>
</html>