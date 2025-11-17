
package fr.ecommerce;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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


public class ECommerceController extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
