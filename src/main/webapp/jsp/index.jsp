<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
	<title>网上书店</title>
	<link href="${pageContext.request.contextPath }/css/bookstore.css" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div class=content>
		<div class=left>
			<div class=list_box>
				<div class=list_bk>
				<c:import url="http://localhost:8080/SSMMaven/browseCatalog.action"></c:import>
					<%-- <c:import url="${pageContext.request.contextPath }/browseCatalog.action"></c:import> --%>
					<!-- <s:action name="browseCatalog" executeResult="true" /> -->
				</div>
			</div>
		</div>
		<div class=right>
			<div class=right_box>
				<font face=宋体></font><font face=宋体></font><font face=宋体></font><font face=宋体></font>
				<div class=banner></div>
				<div align="center">
					<!-- <s:action name="newBook" executeResult="true" /> -->
					<c:import url="http://localhost:8080/SSMMaven/newBook.action"></c:import>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
