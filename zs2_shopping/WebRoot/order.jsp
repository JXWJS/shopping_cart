<%@ include file="base.jsp" %>
<%@ include file="header.jsp" %>
<%@ include file="footer.jsp" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="entity.UserOrder" %>
 <%@ taglib uri="/struts-tags" prefix="s" %>
 <%@ page import="service.OrderService" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户订单表</title>
</head>
<body>


<s:form action="insert_order" >
	<table>
		<% //String username=(String)session.getAttribute("NowLoginUsername"); 
			OrderService orderService=new OrderService();
			String accountCode=orderService.getAccountCode(username);
			String accountDate=orderService.getAccountDate();
		 	%>
	交易日期:&nbsp;<input name="order.accountDate" value="<%=accountDate %>" /><br/>
	流水号:&nbsp; &nbsp;&nbsp;<input name="order.accountCode"  value="<%=accountCode %>" />

	<s:textfield type="text" name="order.realname" label="姓名"/>

			
	<s:textfield type="text" name="order.phone" label="手机号码"/>

	<s:textfield type="text" name="order.address" label="地址" />

	<s:textfield type="text" name="order.postCode" label="邮箱"/>

	<tr>	
		<td><a href="detailCart">返回</a></td>
		<td> <input type="submit" value="结账" class="btn-success" /></td>
	</tr>
		
</table>
</s:form>


</body>
</html>