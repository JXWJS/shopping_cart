<%@ include file="header.jsp" %>
<%@ include file="footer.jsp" %>
<%@page import="entity.Product"%>
<%@page import="java.util.Map"%>
<%@ page import="service.CartService" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="bean.*" import="entity.*"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
</head>
<body>
	
    
    <table class="table table-hover">
    <tr>
    	<th>商品名</th><th>商品价格</th><th>购买数量</th><th>商品小计</th>
    	<th>修改数量</th><th>删除商品</th>
   	</tr>
   	<c:set var="s" value="0"> </c:set>
   	<c:forEach items="${cart.map}" var="cart">
   		<c:set var="s" value="${s + cart.value.subtotal }"></c:set>
   	<tr>
   		
   		<td>${cart.value.product.name}</td>
   		<td>${cart.value.product.price}</td>
   		<form action="update">
   		<input type="hidden" name="uid" value="${cart.key }">
   		<td><input name="count" type="text" value="${cart.value.count}"/></td>
   		<td>${cart.value.subtotal}</td>
   		<td><input type="submit"  value="修改数量"></td>
   		</form>
   		<td>
   			<s:url  id="url" action="deleteProduct"> 
   		    	 <s:param name="id">${cart.key }</s:param>
   		    	 <s:param name="sub">${s}</s:param>
   			</s:url>
   			<s:a href="%{url}" onclick="return confirm('确定删除')">删除商品</s:a>
   		</td>	
   	</tr>
   	</c:forEach>
   	
   	<tr>
   	<td><a href="delete_cart">清空购物车</a></td>
   	<td>总金额 &nbsp; ${s}</td>
   	<td><a href="order.jsp">结账</a></td>
   	<td><a href="pageQuery?pages=1">返回继续购物</a></td>
   	</tr>
   	
    </table>
   		
</body>
</html>