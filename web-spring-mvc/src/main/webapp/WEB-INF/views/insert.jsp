<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hi this is insert page
<br/>
${msg}
<form action ="insert" method ="post" >
Id : <input type = "text" id = "id" name ="id"/>
Name : <input type = "text" id = "name" name ="name"/>
<input type="submit">
<input type ="reset">
</form>
<a href ="">Home</a>
</body>
</html>