<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
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
					<!-- <s:action name="browseCatalog" executeResult="true" /> -->
				<c:import url="http://localhost:8080/SSMMaven/browseCatalog.action"></c:import>
				</div>
			</div>
		</div>
		<div class=right>
			<div class=right_box>
				<c:choose>
				<c:when test="${bookItems.size()>0 }">
					<h3><font color="blue">所有符合条件的图书</font></h3>
					<br />			
						<table width=600 border=0>
						<c:forEach var="book" items="${bookItems }">
							<tr>
								<td width=200 align="center">
									<img src="${pageContext.request.contextPath }/picture/${book.picture }" width="100">
								</td>
								<td valign="top" width=400>
									<table>
										<tr>
											<td>
												书名:${book.bookname }<br>
											</td>
										</tr>
										<tr>
											<td>
												价格:${book.price }元
												<form action="${pageContext.request.contextPath }/addToCart.action" method="post">
													数量:
													<input type="text" name="quantity" value="0" size="4" />
													<input type="hidden" value="${book.bookid }" name="bookid" />
													<input type="image" name="submit" src="${pageContext.request.contextPath }/picture/buy.gif" />
												</form>
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</c:forEach>
						</table>					
					</c:when>
				<c:otherwise>
					对不起,没有您要找的图书!
				</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
