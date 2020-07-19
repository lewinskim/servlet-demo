package com.pl.lodz;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgrammingLanguageDashboardServlet extends HttpServlet {

    private final static Logger logger = Logger.getLogger(ProgrammingLanguageDashboardServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<!DOCTYPE html><html><head><title>code</title>");
        writer.println("<style>");
        writer.println("table {border-collapse: collapse;width: 60%; margin-left:20%; margin-right:20%;}");
        writer.println("table, th, td {border: 1px solid black; text-align: left}");
        writer.println("</style>");
        writer.println("</head>");


        writer.println("<body>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<th>Programming Language</th>");
        writer.println("<th>Usage</th>");
        writer.println("<th>Diff level</th>");
        writer.println("</tr>");

        writer.println("<tr>");
        writer.println("<td>Java</td>");
        writer.println("<td>WEB, Desktop, Mobile</td>");
        writer.println("<td>3/5</td>");
        writer.println("</tr>");

        writer.println("<tr>");
        writer.println("<td>PHP</td>");
        writer.println("<td>WEB</td>");
        writer.println("<td>2/5</td>");
        writer.println("</tr>");

        writer.println("</table>");

        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    public void init() throws ServletException {
        logger.info("I should be initialized first");
    }
}
