<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
This is display page
<table border="1" width="50%">
		<tr>
			<th>ID</th>
			<th>Name</th>
		</tr>
		
		<c:forEach items="${list}" var="stu">
		<tr>
			<td><c:out value="${stu.id}"/></td>
			<td><c:out value="${stu.name}"/></td>
		</tr>
		</c:forEach>
	</table>
	<a href ="">Home</a>
</body>
</html>