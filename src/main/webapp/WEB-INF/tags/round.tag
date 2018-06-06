<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ attribute name="number" required="true" type="com.fvv.std.util.MathUtil" %>

<c:set var="number" value="${number}" />

<%-- <fmt:formatNumber type="number" value="${number}"/>  --%>

<%-- <fmt:formatNumber value='${id}' var="parsedNumber" type="double" maxFractionDigits="0"/> --%>

<%-- <c:set var="accountBalance" value="9500.67764" />
<p>as it is: <strong><fmt:formatNumber value="${accountBalance}" />
</strong></p>
<p>max. digits 2: <strong> <fmt:formatNumber type="number" maxFractionDigits="2" value="${accountBalance}" />
</strong></p> --%>