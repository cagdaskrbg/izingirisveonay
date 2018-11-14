<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
...
<table>
	<tr>
		<td><c:out value="Id" /></td>
		<td><c:out value="Employee" /></td>
		<td><c:out value="Week" /></td>
		<td><c:out value="Month" /></td>
		<td><c:out value="Year" /></td>
		<td><c:out value="Approved" /></td>
		<td><c:out value="Date" /></td>
	</tr>
	<c:forEach items="${holidays}" var="item">
		<tr>
			<td><c:out value="${item.getId()}" /></td>
			<td><c:out value="${item.getEmployee().getName()}" /></td>
			<td><c:out value="${item.getWeek()}" /></td>
			<td><c:out value="${item.getMonth()}" /></td>
			<td><c:out value="${item.getYear()}" /></td>
			<td><c:out value="${item.isApproved()}" /></td>
			<td><c:out value="${item.getDate()}" /></td>
		</tr>
	</c:forEach>
</table>