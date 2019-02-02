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
					<c:import url="http://localhost:8080/SSMMaven/browseCatalog.action"></c:import>
				</div>
			</div>
		</div>
		<div class=right>
			<div class=right_box>
				<c:forEach items="${bookItems }" var="book">
					<table width=600 border=0>
						<tr>
							<td width=200 align="center">
								<img src="${pageContext.request.contextPath }/picture/${book.picture}" width="100">
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
												数量:<input type="text" name="quantity" value="0" size="4" />
												<input type="hidden"value="${book.bookid }" name="bookid">
												<input type="image" name="submit" src="${pageContext.request.contextPath }/picture/buy.gif" />
											</form>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					</c:forEach>
				<c:set var="pager" value="${requestScope.pager }"  />
				<c:if test="${requestScope.pager.hasFirst }">
					<a href="${pageContext.request.contextPath }/browseBookPaging.action?catalogid=${requestScope.catalogid}&currentPage=1">首页</a>
				</c:if>
					
				<c:if test="${requestScope.pager.hasPrevious }">
					<a href="${pageContext.request.contextPath }/browseBookPaging.action?catalogid=${requestScope.catalogid}&currentPage=${requestScope.pager.currentPage - 1 } ">上一页</a>
				</c:if>
					
				<c:if test="${requestScope.pager.hasNext }">
					<a href="${pageContext.request.contextPath }/browseBookPaging.action?catalogid=${requestScope.catalogid}&currentPage=${requestScope.pager.currentPage + 1} ">下一页</a>
				</c:if>
				<c:if test="${requestScope.pager.hasLast }">
					<a href="${pageContext.request.contextPath }/browseBookPaging.action?catalogid=${requestScope.catalogid}&currentPage=${requestScope.pager.totalPage }">尾页</a>
				</c:if>
				<br>
				当前第  ${requestScope.pager.currentPage } 页, 总共  ${requestScope.pager.totalPage } 页
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
