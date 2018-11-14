<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Employee Registration Form</title>
</head>
<hr>

<a href="employeeController">Hello Dear Employee</a>
<br><br>
<br><br>

<body>

	<form:form action="/employee/save-form" modelAttribute="employee" >

		First name: <form:input path="Name" />

		<br><br>

		Last name: <form:input path="lastName" />

		<br><br>

		Available Days:<form:input path="availableDays"/>
		<br><br>

		<br><br>

	<br><br>

		<input type="submit" value="Submit" />

	</form:form>


</body>

</html>












