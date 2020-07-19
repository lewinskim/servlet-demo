package com.pl.lodz;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AboutMeServlet extends HttpServlet {

    private final static Logger logger = Logger.getLogger(AboutMeServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<p>Marek L</p>");
    }

    @Override
    public void init() throws ServletException {
        logger.info("I should be initialized after ProgDashboard");
    }
}
