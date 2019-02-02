<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="${pageContext.request.contextPath }/css/bookstore.css" rel="stylesheet" type="text/css">
<h1><span class="green14b">新书展示</span></h1>
<br>
<div class=info_bk1>
	<!-- <s:iterator value="#request['books']" id="book"> -->
	<c:forEach items="${books }" var="book">
		<div class=xh5>
			<img height=105 width=80 src="${pageContext.request.contextPath }/picture/${book.picture }" /><BR>
			${book.bookname }
			<br>价格:${book.price }元<br>
			<form action="${pageContext.request.contextPath }/addToCart.action" method="post">
				数量:<input type="text" name="quantity" id="quantity" value="0" size="4"/>
				<input type="hidden" value="${book.bookid }" name="bookid">
				<input type="image" name="submit" src="${pageContext.request.contextPath }/picture/buy.gif"/>
			</form>
		</div>
	</c:forEach>
	<!-- </s:iterator> -->
</div>
