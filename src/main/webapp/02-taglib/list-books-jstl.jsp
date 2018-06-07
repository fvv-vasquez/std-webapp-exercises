<jsp:useBean id="bookView" class="com.fvv.std.web.view.BookView" />
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Listing All Books using JSTL</title>
</head>
<body>
	<c:import url="header.jsp" />
	<br/>
	<br/>
	
	<table border="1">
		<tr>
			<td><b>#</b></td>
			<td><b>ID</b></td>
			<td><b>Title</b></td>
			<td><b>Publication Date</b></td>
			<td><b>Unit Price</b></td>
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
	<br />
	<a href="../index.jsp">Home</a>
</body>
</html>