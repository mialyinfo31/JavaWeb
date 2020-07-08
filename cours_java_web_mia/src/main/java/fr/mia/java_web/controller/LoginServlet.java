package fr.mia.java_web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    private static final String TEST_SERVLET = "LA SERVLET EST OK";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response type
        resp.setContentType("text/html");

        // Actual logic goes here
        PrintWriter out = resp.getWriter();
        out.println("Login done");

        // Récupérer les parametres du formulaire en demandant a la requete

    }
}