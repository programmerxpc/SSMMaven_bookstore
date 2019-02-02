<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
	<title>网上购书系统</title>
	<link href="${pageContext.request.contextPath }/css/bookstore.css" rel="stylesheet" type="text/css">
</head>
<body>
	<ul class=point02>
		<li>
			<strong>图书分类</strong>
		</li>
		<c:forEach items="${catalogname }" var="item">
			<li>
				<%-- <a href="browseBookPaging.action?catalogid=<s:property value="#catalog.catalogid"/>" target=_self>
					<!-- <s:property value="#catalog.catalogname" /> -->
				</a> --%>
				<a href="${pageContext.request.contextPath }/browseBookPaging.action?catalogid=${item.catalogid}&currentPage=1">
					${item.catalogname }
				</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>
