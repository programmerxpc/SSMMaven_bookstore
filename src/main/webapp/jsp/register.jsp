<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
	<title>网上书店</title>	
</head>
<body>
	<!-- 导入 head.jsp -->
	<jsp:include page="head.jsp"></jsp:include>
	<div class=content>
		<div class=left>
			<div class=list_box>
				<div class=list_bk>
					<!-- 执行 browseCatalog 的 Action，并把结果显示在该位置，该 action 的功能是显示所有的图书类型，该功能会在后面讲述，下同 -->
					<!-- <s:action name="browseCatalog" executeResult="true" /> -->
					<c:import url="http://localhost:8080/SSMMaven/browseCatalog.action"></c:import>
				</div>
			</div>
		</div>
		<div class=right>
			<div class=right_box>
				<div class=info_bk1>
					<div align="center">
						<form id="zc" action="${pageContext.request.contextPath }/register.action" method="post" name="form1">
							用户注册
							<br>
							用户名：<input type="text" id="name" name="username" size=20 onblur="validate()" />
							<br>
							密&nbsp;&nbsp;&nbsp;&nbsp;码：
							<input type="password" id="password" name="password" size=21 />
							<br>
							性&nbsp;&nbsp;&nbsp;&nbsp;别：
							<input type="text" name="sex" size=20 />
							<br>
							年&nbsp;&nbsp;&nbsp;&nbsp;龄：
							<input type="text" name="age" size=20 />
							<br>
							<input type="button" value="注册" onclick="register()">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"></jsp:include>
<script type="text/javascript">
    function register(){
    	var name=document.getElementById('name');
    	var password = document.getElementById('password');
    	var bd = document.getElementById('zc');
    	if(name.value == ''){
    		alert("用户名不能为空哦!");
    		return false;
    	}else if(password.value == ''){
    		alert("密码不能为空哦!");
    	}else{
    		bd.submit();
    	}
    }
</script>
</body>
</html>
