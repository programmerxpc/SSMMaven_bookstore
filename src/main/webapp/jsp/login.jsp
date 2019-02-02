<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html public "-//w3c//dtd html 4.01 transitional//en" 
"http://www.w3c.org/tr/1999/rec-html401-19991224/loose.dtd">
<html>
<head>
	<title>网上购书系统</title>
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div class=content>
		<div class=left>
			<div class=list_box>
				<div class=list_bk>
					<c:import url="http://localhost:8080/SSMMaven/browseCatalog.action"></c:import>
				</div>
			</div>
		</div>
		<div class=right>
			<div class=right_box>
				<font face=宋体></font><font face=宋体></font><font face=宋体></font><font face=宋体></font>
				<div class=banner></div>
				<div class=info_bk1>
					<div align="center">
						<form action="${pageContext.request.contextPath }/login.action" method="post" name="login">
							用户登录
							<br/>
							用户名：
							<input type="text" name="username" size=20 id="username">
							<br/>
							密&nbsp;&nbsp;&nbsp;&nbsp;码：
							<input type="password" name="password" size=21	id="password">
							<br/>
							<input type="submit" value="登录">
						</form><br/>
						<span style="color: red;font-size: 14px;">${requestScope.msg }</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
