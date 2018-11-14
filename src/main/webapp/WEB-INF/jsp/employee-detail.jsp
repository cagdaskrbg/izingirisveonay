<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
...

<c:out value="${employee.getName()}" />

<br/>

<br/>
...
<table>
	<tr>
		<td><c:out value="Id" /></td>
		<td><c:out value="Week" /></td>
		<td><c:out value="Month" /></td>
		<td><c:out value="Year" /></td>
		<td><c:out value="Approved" /></td>
	</tr>
	<c:forEach items="${holidays}" var="item">
		<tr>
			<td><c:out value="${item.getId()}" /></td>
			<td><c:out value="${item.getWeek()}" /></td>
			<td><c:out value="${item.getMonth()}" /></td>
			<td><c:out value="${item.getYear()}" /></td>
			<td><c:out value="${item.isApproved()}" /></td>
		</tr>
	</c:forEach>
</table>

<a href="../compello-date/save-form?employeeId=${employee.getId()}" >New Holiday</a>