package fr.mia.java_web.controller;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    //private static  String login = "LA SERVLET LOGIN EST OK";
    //private static  String password = "LA SERVLET LOGIN EST OK";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response type
        //resp.setContentType("text/html");

        /* Actual logic goes here
        PrintWriter out = resp.getWriter();
        out.println("Login done  " +  req.getParameter("login") + " PASSWORD  " + req.getParameter("password"));

        // EXO 1 => Récupérer les parametres du formulaire en demandant a la requete
             req.getParameter("login");
             req.getParameter("password"); */

        // EXO 2 => Dispatcher les paramètres vers un autre jsp
        final ServletContext servletContext = req.getServletContext();
        final RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/loginResponse");
        requestDispatcher.forward(req, resp);
    }


}