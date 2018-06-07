<jsp:useBean id="roundNumber" class="com.fvv.std.util.MathUtil" />

<%@ attribute name="value" required="true"%>

<%
	Double number = roundNumber.round(Double.parseDouble(value));
	out.println(number);
%>
