<%@page import="service.CartService"%>
<%@page import="java.util.List" %>
<%@page import="entity.Product" %>
<%@ include file="base.jsp" %>
<%@ include file="header.jsp" %>
<%@ include file="footer.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="service.CartService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>浏览商品</title>
</head>
<body>
	
<center>
	 <h1>欢迎<%=(String)session.getAttribute("NowLoginUsername") %>购物</h1>

<table class="table table-striped" >
<tr>
		<th>商品id</th><th>商品</th><th>商品名称</th><th>商品数量</th><th>商品价格</th><th>加入购物车</th>
		</tr>

<c:forEach var="list" items="${list }">
<tr>
 	<td>${list.id}</td> 
  	<td><img src="${list.picUrl}" width="100px" height="100px"/></td>
   	<td><a href="detail_Product?id=${list.id}">${list.name}</a></td>
 	<td>${list.count}</td>
 	<td>${list.price}</td>
 
<td>
<s:url id="url" action="addProduct">
	<s:param name="id">${list.id}</s:param>
	<s:param name="name"> ${list.name}</s:param>
	<s:param name="count">${list.count}</s:param>
	<s:param name="price"> ${list.price}</s:param>
</s:url>

 <s:a href="%{url}">加入购物车</s:a>
 </td>

</c:forEach>

</table>
</center>

<%
 	int pages=Integer.parseInt(request.getParameter("pages"));
 	 List<Product> list = (List<Product>)request.getAttribute("list") ;
 	if(list.size()==0){
 	 response.setHeader("location","pageQuery?pages=1");
 	 %>
   <h1>页面超出范围,三秒后跳转.....</h1> 
 <%	 String content = 3+"; url="+"landing.jsp";
				response.setHeader("refresh",content); 
 	}else{
 	%>
 	
 	<ul class="pager">
 		<li><a href="pageQuery?pages=<%=pages-1 %>">上一页</a></li>
 		<li><a href="pageQuery?pages=<%=pages+1 %>">下一页</a></li>
 	</ul>
 	
 	<% 
 	
 	}
 	%>
 	
 	
 


</body>
</html>