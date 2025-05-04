<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel ="stylesheet" href = "css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="AddCustomer">
	<div class="form-floating mb-3">
	  <input type="text" class="form-control" id="floatingInput" name="name" placeholder="John Silva">
	  <label for="floatingInput">Name</label>
	</div>
	<div class="form-floating mb-3">
	  <input type="text" class="form-control" id="floatingInput" name="age" placeholder="22">
	  <label for="floatingInput">Age</label>
	</div>
	<div class="form-floating mb-3">
	  <input type="email" class="form-control" id="floatingInput" name="email" placeholder="name@example.com">
	  <label for="floatingInput">Email address</label>
	</div>
	<div class="form-floating">
	  <input type="password" class="form-control" id="floatingPassword" name="password"placeholder="Password">
	  <label for="floatingPassword">Password</label>
	</div>
	
	<button type="submit" class="btn btn-secondary">Submit</button>
	
	</form>

</body>
</html>