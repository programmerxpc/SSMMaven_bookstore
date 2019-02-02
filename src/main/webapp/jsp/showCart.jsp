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
	<jsp:include page="head.jsp"></jsp:include>
	<div class=content>
		<div class=left>
			<div class=list_box>
				<div class=list_bk>
					<!-- <s:action name="browseCatalog" executeResult="true" /> -->
					<c:import url="http://localhost:8080/SSMMaven/browseCatalog.action"></c:import>
				</div>
			</div>
		</div>
		<div class=right>
			<div class=right_box>
			<c:set var="items" value="${sessionScope.cart.items }" />
			
				<c:choose>
				<c:when test="${not empty items }">
					<h3><font color="blue">您购物车中图书</font></h3>
					<div class="info_bk1">
						<c:forEach var="item" items="${sessionScope.cart.items }">
							<form action="${pageContext.request.contextPath }/updateCart.action" method="post">
								<table width="600" border="0">
									<tr align="left">
										<td width="50">书名：</td>
										<td width="100">
											<!-- <s:property value="value.book.bookname" /> -->
											${item.value.book.bookname}
										</td>
										<td width="50">价格：</td>
										<td width="50">
											${item.value.book.price} 
										</td>
										<td width="50">数量：</td>
										<td width="50">
											<input type="text" name="quantity" value="${item.value.quantity }" size="4" />
											<input type="hidden" name="bookid" value="${item.value.book.bookid }" />
										</td>
										<td width="50">
											<input type="submit" value="更新" />
										</td>
									</tr>
								</table>
							</form>
						</c:forEach>
					</div>
					消费金额:${sessionScope.cart.totalPrice }元&nbsp;&nbsp;&nbsp;
					<a href="${pageContext.request.contextPath }/checkout.action"><img src="${pageContext.request.contextPath }/picture/count.gif" /></a>
				</c:when>
				<c:otherwise>
					对不起,您还没有选购任何书籍!
				</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
