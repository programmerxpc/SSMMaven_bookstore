<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html public "-//w3c//dtd html 4.01 transitional//en" 
"http://www.w3c.org/TR/1999/rec-html401-19991224/loose.dtd">
<html>
<head>
	<title>网上购书系统</title>
	<link href="${pageContext.request.contextPath }/css/bookstore.css" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div class=content>
		<div class=left>
			<div class=list_box>
				<div class=list_bk>
					<!-- <s:action name="browseCatalog" executeResult="true"></s:action> -->
					<c:import url="http://localhost:8080/SSMMaven/browseCatalog.action"></c:import>
				</div>
			</div>
		</div>
		<div class=right>
			<div class=right_box>
				<font face=宋体>图书添加成功!</font>
				<form action="${pageContext.request.contextPath }/toIndex.action" method="post">
					<input type="hidden" value="${sessionScope.catalogid }" />
					<input type="image" name="submit" src="${pageContext.request.contextPath }/picture/continue.gif" />
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
