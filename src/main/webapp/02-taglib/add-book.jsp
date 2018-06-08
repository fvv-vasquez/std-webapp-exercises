<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Adding a Book</title>
</head>
<body>
	<c:import url="menu.jsp" />
	<c:import url="header.jsp" />
	<br />
	<br />

	<form action="addBook" method="post" id="formAddBook">
		<p>
			Title: <input type="text" name="title" />
		</p>
		<p>
			Unit Price: <input type="text" name="unitPrice" />
		</p>
		<p>
			Publication Date: <input type="text" name="publicationDate" />
		</p>
		<input type="submit" value="Record" />
	</form>
	<br />
	<a href="../index.jsp">Home</a>
	<br />
	<c:import url="footer.jsp" />
</body>
</html>