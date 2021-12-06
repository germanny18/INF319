<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int n = 6;
out.print(fibo(n));

%>
<%! public int fibo(int n){ 
	if(n==0 || n==1)
		return 1;
	else
		return fibo(n-2)+fibo(n-1);
}

%>


</body>
</html>