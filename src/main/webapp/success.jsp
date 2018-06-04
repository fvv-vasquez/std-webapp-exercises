<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
		<p><h3>Success: </h3></p>
		
		<c:set var="message" value='${requestScope["resultMsg"]}' />
		<c:set var="returnPage" value='${requestScope["returnPage"]}' />
		
		<c:out value="${message}"/>
		<br/>
		<a href="${returnPage}">Add New Book</a>
	</body>
</html>