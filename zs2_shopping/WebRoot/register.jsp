<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="base.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>用户注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script language="javascript" src="JS/check.js">  </script>
  </head>  
  <body>
    <center>
    <form action="userRegister" method="post"  role="form" class="form-horizontal" onSubmit="return checkForm()">
    <table>
    <div class="form-group">
    	<tr><td >用户名:</td>
    		<td><input name="user.username" type="text" onfocus="focus_username()" onblur="blur_username()" /></td>
    		<td><span id="user_res"></span></td>
    	</tr>
    </div>
    <div class="form-group">
    	<tr><td >真实姓名：</td>
    		<td><input name="user.realname" type="text" /></td>
    	</tr>
    </div>
    <div class="form-group">
    	<tr><td>密码：</td>
    	<td><input name="user.password" type="password" onfocus='focus_password()' onblur = 'blur_password()'/></td>
    	<td><span id="pass_res"></span></td>
    	</tr>
    </div>
    <div class="form-group">
     <tr>
          <td>确认密码:</td>
          <td><input type='password' name='repeat' onfocus='focus_repeat()' onblur = 'blur_repeat()'/></td>
          <td><span id="pass_rep"></span></td>
     </tr>   
     </div>
    <div class="form-group">
    	<tr><td>手机号码：</td>
    		<td><input name="user.tel" type="text" /></td>
    	</tr>
    </div>
    <div class="form-group">
    	<tr><td>电子邮箱：</td>
    		<td><input name="user.email" type="text" /></td>
    	</tr>
    </div>
    	<tr>
    	<td><input type="submit" value="注册" class="btn btn-default"></td>
    	<td><input type="reset" value="重置" class="btn-primary"></td>
    	<td><a href="login.jsp">返回登录界面</a></td>
    	</tr>
    </table>
    </form>    	
    </center>
  </body>
</html>
