<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
...
<table>
	<tr>
		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
	</tr>
</table>
<table>
	<c:forEach items="${employees}" var="item">
		<tr>
			<td><c:out value="${item.getId()}" /></td>
			<td><c:out value="${item.getName()}" /></td>
			<td><c:out value="${item.getLastName()}" /></td>
		</tr>
	</c:forEach>
</table>