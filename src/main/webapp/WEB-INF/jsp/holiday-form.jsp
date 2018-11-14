<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Employee Holiday Form</title>
</head>
<hr>


<body>

	<form:form action="/compello-date/save?employeeId=${empId}" modelAttribute="compelloDate" >

		Week: <form:input path="week" />

		<br><br>

		Month: <form:input path="month" />

		<br><br>

		Year: <form:input path="year" />

		<br><br>

		Holiday Type:
		<select id="holidayType" name="holidayType">
			<option value="SICKDAY">Sick Day</option>
			<option value="ANNUAL">Annual Holiday</option>
		</select>

		<br><br>

		<br><br>
	<br><br>

		<input type="submit" value="Submit" />

	</form:form>


</body>

</html>












