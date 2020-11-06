<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello JSP</h1>
<input type="text" value="MMIT"></br>
<a href="index.html"></a><br/>
<%out.print("Current Date: "+LocalDate.now()); %>
</body>
</html>