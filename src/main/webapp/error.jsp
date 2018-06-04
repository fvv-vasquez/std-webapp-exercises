<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
		<p><h3>Error Page: </h3></p>
		
		<c:set var="message" value='${requestScope["resultMsg"]}' />
		<c:set var="returnPage" value='${requestScope["returnPage"]}' />
		
		<c:out value="${message}"/>
		<br/>
		<a href="${returnPage}">Try Again...</a>
	</body>
</html>