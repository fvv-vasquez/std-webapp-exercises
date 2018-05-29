<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Random"%>

<html>
<head>
<title>Using Random</title>
</head>
<body>
	<h1>Using Random</h1>
	<%
		List<Integer> randomNumbers = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			randomNumbers.add(random.nextInt(101));
		}
		Collections.sort(randomNumbers);
		out.println(randomNumbers);
	%>
</body>
</html>