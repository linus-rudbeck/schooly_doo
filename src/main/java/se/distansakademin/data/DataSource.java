package se.distansakademin.data;

import se.distansakademin.models.User;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    List<User> users = new ArrayList<>();

    public boolean addUser(User user) {
        users.add(user);
        return true;
    }

    public User getUser(String fullName) {
        for (User user : users){
            if(fullName.equalsIgnoreCase(user.getFullName())){
                return user;
            }
        }

        return null;
    }
}
