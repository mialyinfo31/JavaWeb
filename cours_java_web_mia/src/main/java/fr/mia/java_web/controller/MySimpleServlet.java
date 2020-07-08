package fr.mia.java_web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MySimpleServlet extends HttpServlet {
    private static final String TEST_SERVLET = "LA SERVLET EST OK";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // Set response type
        resp.setContentType("text/html");

        // Actual logic goes here
        PrintWriter out = resp.getWriter();
        out.println("<h1>"+ TEST_SERVLET +"</h1>");
    }
}
