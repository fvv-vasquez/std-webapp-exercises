<html>
<head>
<title>Using For Loop</title>
</head>
<body>
	<h1>Using For Loop</h1>
	<%
		for (int i = 1; i < 11; i++) {
			if (i < 10) {
				out.println(i + ",");
			} else {
				out.println(i);
			}			
		}
	%>
</body>
</html>