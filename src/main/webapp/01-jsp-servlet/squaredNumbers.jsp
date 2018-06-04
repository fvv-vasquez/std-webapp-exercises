<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<html>
<head>
<title>Squared Numbers</title>
</head>
<body>
	<h1>Squared Numbers</h1>
	<%
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			int pow = (int) Math.pow(i, 2);
			sum += pow;
			if (i % 2 == 0) {
				out.println("<font color='red'>" + i + " = " + sum + "<br>");
			} else {
				out.println("<font color='blue'>" + i + " = " + sum + "<br>");
			}
		}
	%>
</body>
</html>