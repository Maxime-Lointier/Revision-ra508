
package fr.ecommerce;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

/**
 * Contrôleur unique de l'application e-commerce.
 *
 * OBJECTIF ÉTUDIANT :
 *  - Implémenter le routage en fonction du paramètre "action"
 *  - Gérer l'authentification via UserService
 *  - Gérer le panier via PanierService (en session)
 *  - Respecter le pattern MVC (Servlet = Contrôleur, Services = Modèle, JSP = Vue)
 *
 * URL d'entrée unique : /controler
 */


    @WebServlet("/controler") 
    public class ECommerceController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String login = request.getParameter("login");
        String password = request.getParameter("password");

   
        if (UserService.authenticate(login, password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("userLogin", login);

            response.sendRedirect(request.getContextPath() + "/menu.jsp");
        } else {
            request.setAttribute("error", "Identifiant ou mot de passe incorrect.");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/login.jsp");
    }
}

