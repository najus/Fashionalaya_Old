<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form role="form" name="frmlogin" id="frmlogin"
	action="<spring:url value="/postLogin" />" method="post">
	
	<p class="text-danger"><c:if test="${not empty error}">Unable to login: ${error}</c:if></p>
	<p class="text-danger">  <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/></p>
	
	
	<fieldset>
		<div class="form-group">
			<input class="form-control" placeholder="Username" name="username"
				type="text" autofocus>
		</div>
		<div class="form-group">
			<input class="form-control" placeholder="Password" name="password"
				type="password" value="">
		</div>
		<!-- div class="checkbox">
			<label> <input name="remember" type="checkbox"
				value="Remember Me">Remember Me
			</label>
		</div> -->
		<!-- Change this to a button or input when using this as a form -->
		<input type="submit" name="btnLoginSubmit" value="Login"
			class="btn btn-lg btn-success btn-block" />
	</fieldset>

</form>

</body>
</html>