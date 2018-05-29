<html>
<head>
<title>Squared Numbers</title>
</head>
<body>
	<h1>Squared Numbers</h1>
	<%
	for (int i = 1; i <= 10; i++) {
		Double pow = Math.pow(i, 2);
		String print = (i + "! = " + pow);
		if(i <= 1) {
			out.println(print + "<br>");
		} else {
			print += print + "<br>";
			out.println(print);
		}
	}
	%>
</body>
</html>