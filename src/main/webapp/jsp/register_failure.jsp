<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h4>注册失败!</h4></br>
用户名${user.username }，已经存在！
<a href="${pageContext.request.contextPath }/jsp/register.jsp">点击此处返回注册页面</a>

</body>
</html>