package com.pl.lodz;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProgrammingLanguageDashboardServlet", value = "/code", loadOnStartup = 1)
public class ProgrammingLanguageDashboardServlet extends HttpServlet {

    private final static Logger logger = Logger.getLogger(ProgrammingLanguageDashboardServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
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
