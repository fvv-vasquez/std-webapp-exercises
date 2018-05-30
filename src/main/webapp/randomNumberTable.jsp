<%@page import="java.math.RoundingMode"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.Random"%>

<html>
<head>
<title>Generating a Random Number Table</title>
</head>
<body>
	<h2><i>Generating a Random Number Table</i></h2>
	<table border="1" style="font-family:Verdana; font-size:12px;">
		<tr align="center" style="background-color:LightBlue;">
			<td width="80px"><b>Trial 1</b></td>
			<td width="80px"><b>Trial 2</b></td>
			<td width="80px"><b>Trial 3</b></td>
			<td width="80px"><b>Horizontal Sum</b></td>
			<td width="80px"><b>Horizontal Average</b></td>
		</tr>

		<%
			Random random = new Random();
			int verticalSum1 = 0;
			int verticalSum2 = 0;
			int verticalSum3 = 0;
			int verticalSum4 = 0;
			double verticalSum5 = 0;
			double verticalAverage1 = 0;
			double verticalAverage2 = 0;
			double verticalAverage3 = 0;
			double verticalAverage4 = 0;
			double verticalAverage5 = 0;

			for (int i = 0; i < 25; i++) {
				int random1 = random.nextInt(11);
				int random2 = random.nextInt(11);
				int random3 = random.nextInt(11);
				int horizontalSum = random1 + random2 + random3;
				double horizontalAverage = horizontalSum / 3.0;
				verticalSum1 += random1;
				verticalSum2 += random2;
				verticalSum3 += random3;
				verticalSum4 += horizontalSum;
				verticalSum5 += horizontalAverage;
				verticalAverage1 = verticalSum1 / 25.0;
				verticalAverage2 = verticalSum2 / 25.0;
				verticalAverage3 = verticalSum3 / 25.0;
				verticalAverage4 = verticalSum4 / 25.0;
				verticalAverage5 = verticalSum5 / 25.0;
		%>
		<tr align="center">
			<td>
				<%
					out.println(random1);
				%>
			</td>
			<td>
				<%
					out.println(random2);
				%>
			</td>
			<td>
				<%
					out.println(random3);
				%>
			</td>
			<td>
				<%
					out.println(horizontalSum);
				%>
			</td>
			<td>
				<%
					out.println(new BigDecimal(horizontalAverage).setScale(2, RoundingMode.HALF_UP).doubleValue());
				%>
			</td>
		</tr>
		<%
			}
		%>
		<tr>
			<th colspan="5" style="color:DarkBlue;">Vertical Sum</th>
		</tr>
		<tr align="center">
			<td>
				<%
					out.println(verticalSum1);
				%>
			</td>
			<td>
				<%
					out.println(verticalSum2);
				%>
			</td>
			<td>
				<%
					out.println(verticalSum3);
				%>
			</td>
			<td>
				<%
					out.println(verticalSum4);
				%>
			</td>
			<td>
				<%
					out.println(new BigDecimal(verticalSum5).setScale(2, RoundingMode.HALF_UP).doubleValue());
				%>
			</td>
		</tr>
		<tr>
			<th colspan="5" style="color:DarkBlue">Vertical Average</th>
		</tr>
		<tr align="center">
			<td>
				<%
					out.println(new BigDecimal(verticalAverage1).setScale(2, RoundingMode.HALF_UP).doubleValue());
				%>
			</td>
			<td>
				<%
					out.println(new BigDecimal(verticalAverage2).setScale(2, RoundingMode.HALF_UP).doubleValue());
				%>
			</td>
			<td>
				<%
					out.println(new BigDecimal(verticalAverage3).setScale(2, RoundingMode.HALF_UP).doubleValue());
				%>
			</td>
			<td>
				<%
					out.println(new BigDecimal(verticalAverage4).setScale(2, RoundingMode.HALF_UP).doubleValue());
				%>
			</td>
			<td>
				<%
					out.println(new BigDecimal(verticalAverage5).setScale(2, RoundingMode.HALF_UP).doubleValue());
				%>
			</td>
		</tr>
	</table>
</body>
</html>