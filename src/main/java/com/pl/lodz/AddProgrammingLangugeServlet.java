package com.pl.lodz;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(name = "AddProgrammingLanguageServlet", value = "/addlanguage")
public class AddProgrammingLangugeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>languages</title>");
        writer.println("</head>");
        writer.println("<body>");

        writer.println("<form method='post' action='/addlanguage'>");
        writer.println("<label for='language'>language name:</label>");
        writer.println("<input id='language' type='text' name='languageContent'/><br>");
        writer.println("<label for='languageusing'>language using:</label>");
        writer.println("<input id='languageusing' type='text' name='languageusingContent'/><br>");
        writer.println("<input type='radio' id='one5' name='radiocontext' value='1/5'>");
        writer.println("<label for='one5'>1/5</label>");
        writer.println("<input type='radio' id='two5' name='radiocontext' value='2/5'>");
        writer.println("<label for='two5'>2/5</label>");
        writer.println("<br>");
        writer.println("<input type='submit' value='Add'/>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        HashMap<String, String> request = new HashMap<>();
        request.put("languageContent",req.getParameter("languageContent"));
        request.put("languageusingContent",req.getParameter("languageusingContent"));
        request.put("radiocontext",req.getParameter("radiocontext"));
        LanguageService.addLanguage(request);
        resp.sendRedirect("/code");
    }
}
