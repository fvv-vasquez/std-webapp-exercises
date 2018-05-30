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
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		int sum = 0;

		for (Integer listOfNumbers : numbers) {
			int pow = (int) Math.pow(listOfNumbers, 2);
			sum += pow;
			if (listOfNumbers % 2 == 0) {
				out.println("<font color='red'>" + listOfNumbers + " = " + sum + "<br>");
			} else {
				out.println("<font color='blue'>" + listOfNumbers + " = " + sum + "<br>");
			}
		}
	%>
</body>
</html>