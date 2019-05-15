
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入jQuery -->
	<script type="text/javascript" src="js/jquery.js"></script>
	<!-- 引入样式 -->
 	<link href="css/bootstrap.min.css" rel="stylesheet">
 	<script src="js/bootstrap.min.js"></script>
</head>
<body>

 <!-- 
<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" href="pageQuery?pages=1">购物</a>
	</div>
	<div>
		<ul class="nav navbar-nav">
			<li>欢迎<%=(String)session.getAttribute("NowLoginUsername") %></li>
			<li class="active"><a href="userOut">用户退出</a></li>
			<li><a href="detailCart">查看购物车</a></li>
			<li class="dropdown"></li>
		</ul>
	</div>
	</div>
	</nav>
  -->
  
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="pageQuery?pages=1">开始购物</a>

        <div class="navbar-nav">

            <ul class="navbar-nav">

                <li class="nav-item">
                   	<a class="nav-link" href="userOut">用户退出</a>
                    <a class="nav-link disabled" href="detailCart">查看购物车</a>
                </li>
                <li class="nav-item ">
                   <a class="nav-link" href="#" >欢迎你
              <%=(String)session.getAttribute("NowLoginUsername") %>
            </a>
        </li>

            </ul>
        </div>
    </div>
</nav>
 
  <%String username=(String)session.getAttribute("NowLoginUsername");
	 if(username.equals("null")){
				response.setHeader("refresh","landing.jsp"); 
				}
				%>
 
 
</body>
</html>