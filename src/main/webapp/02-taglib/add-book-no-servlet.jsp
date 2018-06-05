<html>
<head>
<title>Adding a Book</title>
</head>
<body>
	<p><h3>Adding a book w/o servlet</h3></p>

	<form action="add-book-bean.jsp" method="post" id="formAddBookBean">
		<p>Title: <input type="text" name="title" /></p>
		<p>Unit Price: <input type="text" name="unitPrice" /> </p>
		<p>Publication Date: <input type="text" name="publicationDate" /></p> 
		<input type="submit" value="Record" />
	</form>
	<br />
	<a href="../index.jsp">Home</a>
</body>
</html>