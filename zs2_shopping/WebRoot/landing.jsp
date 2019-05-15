<%@ include file="base.jsp" %>
<%@ include file="header.jsp" %>
<%@ include file="footer.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>欢迎<%=(String)session.getAttribute("NowLoginUsername") %></h1>
<!--  
<h2><a href="showdetails">浏览商品</a></h2>
-->

<h2><a href="pageQuery?pages=1">浏览商品</a></h2>


</center>
</body>
</html>