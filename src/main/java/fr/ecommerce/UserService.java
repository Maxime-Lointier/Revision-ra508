
package fr.ecommerce;

import java.util.HashMap;
import java.util.Map;

/**
 * Service simple d'authentification basé sur une configuration interne.
 * À utiliser depuis le contrôleur unique.
 */
public class UserService {

    private static final Map<String, String> USERS = new HashMap<>();

    static {
        USERS.put("admin", "secret");
        USERS.put("user1", "pass123");
        USERS.put("user2", "hello");
    }

    public boolean authenticate(String login, String password) {
      
        // TODO
        
        
        return false;
        
    }
}
