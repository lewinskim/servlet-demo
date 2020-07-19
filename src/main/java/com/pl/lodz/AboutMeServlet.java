package com.pl.lodz;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AboutMeServlet", value = "/me", loadOnStartup = 2)
public class AboutMeServlet extends HttpServlet {

    private final static Logger logger = Logger.getLogger(AboutMeServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<p>Marek L</p>");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        logger.info("I should be initialized after ProgDashboard");
    }
}
