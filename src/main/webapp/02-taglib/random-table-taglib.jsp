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

	<round:round value="9.666666"/>
	
	
	<h2><i>Generating a Random Number Table using Taglib</i></h2>
	<table border="1" style="font-family:Verdana; font-size:12px;">
		<tr align="center" style="background-color:LightBlue;">
			<td width="80px"><b>Trial 1</b></td>
			<td width="80px"><b>Trial 2</b></td>
			<td width="80px"><b>Trial 3</b></td>
			<td width="80px"><b>Horizontal Sum</b></td>
			<td width="80px"><b>Horizontal Average</b></td>
		</tr>


		<c:forEach var="book" items="${bookView.books}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'dcdccc' : 'ffffff' }">
				<td>${id.count}</td>
				<td>${book.id}</td>
				<td>${book.title}</td>
				<td><tags:localDate date="${book.publicationDate}" /></td>
				<td>${book.unitPrice}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>