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
    protected final static String LOGIN_PAGE_URL ="/WEB-INF/jsp/login_page.jsp";
    protected final static String DASHBOARD_PAGE_URL ="/WEB-INF/jsp/dashboard.jsp";
    protected final static String USER_LOGIN_PARAMETER_NAME ="login";
    protected final static String USER_PASS_PARAMETER_NAME ="password";

    protected JournalistBean initializeJournalist(){
       return new JournalistBean("Palo","Pasix",5 );
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

        JournalistBean journalist = initializeJournalist();
        boolean isJournalistReconized ;

        String jspPageUrl ="";

        //  =>   Récupérer les parametres du formulaire en demandant a la requete
            final String typedLogin = req.getParameter(USER_LOGIN_PARAMETER_NAME);
            final String typedPassword = req.getParameter(USER_PASS_PARAMETER_NAME);

        //  =>   Verification si journaliste reconnu
            isJournalistReconized = checkUser(journalist,typedLogin,typedPassword);
            if(isJournalistReconized)
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
