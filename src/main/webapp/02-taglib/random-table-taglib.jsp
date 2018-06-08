<%@page import="java.util.Random"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="round"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Random Table using Taglib</title>
</head>
<body>
	<c:import url="header.jsp" />
	<br />
	<br />

	<h2>
		<i>Generating a Random Number Table using Taglib</i>
	</h2>
	<table border="1" style="font-family: Verdana; font-size: 12px;">
		<tr align="center" style="background-color: LightBlue;">
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
				pageContext.setAttribute("horizontalAverage", horizontalAverage);
				pageContext.setAttribute("verticalSum5", verticalSum5);
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
			<td><round:round value="${horizontalAverage}" /></td>
		</tr>
		<%
			}
			verticalAverage1 = verticalSum1 / 25.0;
			verticalAverage2 = verticalSum2 / 25.0;
			verticalAverage3 = verticalSum3 / 25.0;
			verticalAverage4 = verticalSum4 / 25.0;
			verticalAverage5 = verticalSum5 / 25.0;
			pageContext.setAttribute("verticalAverage1", verticalAverage1);
			pageContext.setAttribute("verticalAverage2", verticalAverage2);
			pageContext.setAttribute("verticalAverage3", verticalAverage3);
			pageContext.setAttribute("verticalAverage4", verticalAverage4);
			pageContext.setAttribute("verticalAverage5", verticalAverage5);
		%>
		<tr>
			<th colspan="5" style="color: DarkBlue;">Vertical Sum</th>
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
			<td><round:round value="${verticalSum5}" /></td>
		</tr>
		<tr>
			<th colspan="5" style="color: DarkBlue">Vertical Average</th>
		</tr>
		<tr align="center">
			<td><round:round value="${verticalAverage1}" /></td>
			<td><round:round value="${verticalAverage2}" /></td>
			<td><round:round value="${verticalAverage3}" /></td>
			<td><round:round value="${verticalAverage4}" /></td>
			<td><round:round value="${verticalAverage5}" /></td>
		</tr>
	</table>
	<br />
	<a href="../index.jsp">Home</a>
	<br />
	<c:import url="footer.jsp" />
</body>
</html>