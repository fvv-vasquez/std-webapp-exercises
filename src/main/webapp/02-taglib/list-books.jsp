<jsp:useBean id="bookView" class="com.fvv.std.web.view.BookView" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>

<html>
<head>
<title>Listing All Books</title>

<link rel="stylesheet" href="../css/displaytag.css" type="text/css">
<link rel="stylesheet" href="../css/site.css" type="text/css">
</head>
<body>
	<c:import url="menu.jsp" />
	<c:import url="header.jsp" />
	<br />
	<br />

	<display:table name="${bookView.books}"
		decorator="com.fvv.std.web.displaytag.wrapper.BookWrapper" class="table-dt">
		<display:column property="id" title="ID" />
		<display:column property="title" title="Title" />
		<display:column property="publicationDate" title="Publication Date" />
		<display:column property="unitPrice" title="Unit Price" />
	</display:table>
	<br />
	<br />
	<c:import url="footer.jsp" />
</body>
</html>