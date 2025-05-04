<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>My profile</h1>
	
	<c:set var ="cus" value="${customer}"/>
	<fieldset disabled>
	<div class="form-floating mb-3">
	  <input type="text" class="form-control" id="floatingInput" name="name" value="${cus.name}">
	  <label for="floatingInput">Name</label>
	</div>
	<div class="form-floating mb-3">
	  <input type="text" class="form-control" id="floatingInput" name="age" value="${cus.age}" >
	  <label for="floatingInput">Age</label>
	</div>
	<div class="form-floating mb-3">
	  <input type="email" class="form-control" id="floatingInput" name="email" value="${cus.email}">
	  <label for="floatingInput">Email address</label>
	</div>
	<div class="form-floating">
	  <input type="password" class="form-control" id="floatingPassword" name="password" value="${cus.password}">
	  <label for="floatingPassword">Password</label>
	</div>
	
	</fieldset>
<form action="update.jsp" method="post">

	<input type="hidden" name="name" value="${cus.name}">
	<input type="hidden" name="age" value="${cus.age}">
	<input type="hidden" name="email" value="${cus.email}">
	<input type="hidden" name="password" value="${cus.password}">

	<input type="submit" value = "update">
</form>
	

</body>
</html>