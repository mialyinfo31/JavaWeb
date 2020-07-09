package fr.mia.java_web.controller;

import fr.mia.java_web.model.JournalistBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginResponse extends HttpServlet {
    protected static String jspPageUrl ="";
    protected final static String LOGIN_PAGE_URL ="./login_page.jsp";
    protected final static String DASHBOARD_PAGE_URL ="./dashboard.jsp";
    public static JournalistBean journalist;
    protected Boolean IsJournalistReconized ;

    protected JournalistBean initializeJournalist(){
        journalist = new JournalistBean("Palo","Pasix",5 );
        return journalist;
    }

    protected boolean checkUser(JournalistBean j, String login, String password){
        String jLogin = j.getLogin().toUpperCase();
        String jPassword = j.getPassword().toUpperCase();
        if ( (jLogin.equals(login.toUpperCase())) && (jPassword.equals(password.toUpperCase())) ) {
            return true;
        }
        return false;
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response type
        resp.setContentType("text/html");
        initializeJournalist();

        //  =>   Récupérer les parametres du formulaire en demandant a la requete
            String typedLogin = req.getParameter("login");
            String typedPassword =req.getParameter("password");

        //  =>   Verification si journaliste reconnu
            IsJournalistReconized = checkUser(journalist,typedLogin,typedPassword);
            if(IsJournalistReconized==true)
            {
                //   =>  Si Connexion réussie Dispatcher les paramètres vers la jsp de dashboard
                jspPageUrl = DASHBOARD_PAGE_URL;
            }
            else
            {
                //  =>   Si Echec Connexion Dispatcher les paramètres vers la jsp de connexion
                jspPageUrl = LOGIN_PAGE_URL;
            }

        //  => Dispatching proprement dit
            final ServletContext servletContext = req.getServletContext();
            final RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(jspPageUrl);
            requestDispatcher.forward(req, resp);

    }
}
