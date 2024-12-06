package se.distansakademin.services;

import se.distansakademin.models.Admin;
import se.distansakademin.models.User;

public class LoginService {

    private static final String ADMIN_USERNAME = "adminUser";
    private static final String ADMIN_PASSWORD = "adminPass";


    public User login(String username, String password) {

        if(username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)){
            return new Admin(ADMIN_USERNAME);
        }

        return null;
    }
}
