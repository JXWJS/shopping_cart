<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="base.jsp" %>
<%@ include file="footer.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>用户登陆</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
  
    <center>
    <h3 class="text-muted">网上购物车模拟<br><br><br></h3>

    
    <form action="userLogin" method="post"  role="form">
    <div class="form-group">
    <table >
    	<tr><td>用户名：</td>
    		<td><input name="user.username" type="text" class="form-control" /></td>
    	</tr>
    	
    	<tr><td>密码：</td>
    	<td><input name="user.password" type="password" class="form-control" /></td>
    	</tr>
    	
    	<tr>
    	<td><input type="submit" value="登录" class="b tn btn-success"></td>
    	<td><input type="reset" value="重置" class="btn-primary"></td>
    	<td><a href="register.jsp">注册账号</a></td>
    	</tr>
    </table>
    </div>
    </form>    	
    </center>
    
    
  </body>
</html>