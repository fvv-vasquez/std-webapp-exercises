package com.fvv.std.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RandomServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("HTTP GET Invoked...");
		this.generateRandomTable(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("HTTP POST Invoked...");
		this.generateRandomTable(request, response);
	}

	private void generateRandomTable(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Generating a Random Number Table - Servlet</title>");
		out.println("<head>");
		out.println("<body>");

		out.println("<h2><i>Generating a Random Number Table - Servlet</i></h2>");

		out.print("<table border=\"1\" style=\"font-family:Verdana; font-size:12px;\">");

		out.print("<tr align=\"center\" style=\"background-color:LightBlue;\">");
		out.print("<td width=80px><b>Trial 1</b></td>");
		out.print("<td width=80px><b>Trial 2</b></td>");
		out.print("<td width=80px><b>Trial 3</b></td>");
		out.print("<td width=80px><b>Horizontal Sum</b></td>");
		out.print("<td width=80px><b>Horizontal Average</b></td>");
		out.print("</tr>");

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
			verticalAverage1 = verticalSum1 / 25.0;
			verticalAverage2 = verticalSum2 / 25.0;
			verticalAverage3 = verticalSum3 / 25.0;
			verticalAverage4 = verticalSum4 / 25.0;
			verticalAverage5 = verticalSum5 / 25.0;

			out.println("<tr align=center>");
			out.println("<td>" + random1 + "</td>");
			out.println("<td>" + random2 + "</td>");
			out.println("<td>" + random3 + "</td>");
			out.println("<td>" + horizontalSum + "</td>");
			out.println(
				"<td>" + new BigDecimal(horizontalAverage).setScale(2, RoundingMode.HALF_UP).doubleValue() + "</td>");
			out.println("</tr>");
		}

		out.println("<tr><th colspan=\"5\" style=\"color:DarkBlue;\">Vertical Sum</th></tr>");
		out.println("<tr align=center>");
		out.println("<td>" + verticalSum1 + "</td>");
		out.println("<td>" + verticalSum2 + "</td>");
		out.println("<td>" + verticalSum3 + "</td>");
		out.println("<td>" + verticalSum4 + "</td>");
		out.println("<td>" + new BigDecimal(verticalSum5).setScale(2, RoundingMode.HALF_UP).doubleValue() + "</td>");
		out.println("</tr>");

		out.println("<tr><th colspan=\"5\" style=\"color:DarkBlue;\">Vertical Average</th></tr>");
		out.println("<tr align=center>");
		out.println(
				"<td>" + new BigDecimal(verticalAverage1).setScale(2, RoundingMode.HALF_UP).doubleValue() + "</td>");
		out.println(
				"<td>" + new BigDecimal(verticalAverage2).setScale(2, RoundingMode.HALF_UP).doubleValue() + "</td>");
		out.println(
				"<td>" + new BigDecimal(verticalAverage3).setScale(2, RoundingMode.HALF_UP).doubleValue() + "</td>");
		out.println(
				"<td>" + new BigDecimal(verticalAverage4).setScale(2, RoundingMode.HALF_UP).doubleValue() + "</td>");
		out.println(
				"<td>" + new BigDecimal(verticalAverage5).setScale(2, RoundingMode.HALF_UP).doubleValue() + "</td>");
		out.println("</tr>");

		out.print("</table>");

		out.println("<br/><a href=\"index.jsp\">Home</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
