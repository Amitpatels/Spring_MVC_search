<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Form1</title>
</head>
<body class="" style="background: #e2e2e2;">

	<div class="container mt-4">
		<h1>Registration Form</h1>
		<form:errors path="form1.*" />
		<form action="handelForm" method="post">
		
			<div class="form-group">
				<div class="form-group col-md-6">
					<label for="name">Name</label> <input type="text"
						class="form-control" id="name" placeholder="name" name="name">
				</div>
				<div class="form-group col-md-6">
					<label for="id">Your id</label> <input type="text"
						class="form-control" id="id" placeholder="Id" name="id">
				</div>
				<div class="form-group col-md-6">
					<label for="dob">DOB</label> <input type="text"
						class="form-control" id="dob" placeholder="dob" name="date">
				</div>
				<div class="form-group col-md-6">
					<label for="courses">Select Courses</label> <select name="courses"
						class="form-control" class="form-control" id="exampleformcontrol"
						multiple>
						<option>Java</option>
						<option>Python</option>
						<option>C++</option>
						<option>Django</option>
						<option>SpringFrameork</option>
						<option>Microservice</option>
						<option>AWS</option>
					</select>
				</div>
				<div class="form-group col-md-6">
					<label for="gender">Gender : </label>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender"
							id="inlineRadio1" value="male"> <label
							class="form-check-label" for="inlineRadio1">Male</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender"
							id="inlineRadio2" value="female"> <label
							class="form-check-label" for="inlineRadio2">Female</label>
					</div>
				</div>
				<div class="form-group col-md-6">
					<label for="address">Address</label>
					 <input type="text" class="form-control" id="street" placeholder="enter your street" name="address.street">
					 <input type="text" class="form-control" id="city" placeholder="enter your city" name="address.city">
				</div>


				<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>