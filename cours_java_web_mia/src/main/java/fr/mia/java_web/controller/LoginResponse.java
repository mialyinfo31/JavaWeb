package fr.mia.java_web.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginResponse extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response type
        resp.setContentType("text/html");

        /* Actual logic goes here
        PrintWriter out = resp.getWriter();
        out.println("Login done  " +  req.getParameter("login") + " PASSWORD  " + req.getParameter("password"));*/

        // EXO 1 => Récupérer les parametres du formulaire en demandant a la requete
             req.getParameter("login");
             req.getParameter("password");

        /* EXO 2 => Dispatcher les paramètres vers un autre jsp login_response_page.jsp
            final ServletContext servletContext = req.getServletContext();
            final RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("./login_response_page.jsp");
            requestDispatcher.forward(req, resp);*/
    }
}
