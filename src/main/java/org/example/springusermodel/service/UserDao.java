package org.example.springusermodel.service;

import org.example.springusermodel.model.Login;
import org.example.springusermodel.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("duc", "123456", "Duc", "duc@codegym.vn", 23));
        users.add(new User("quy", "123456", "Quy", "quy@codegym.vn", 27));
        users.add(new User("phong", "123456", "Phong", "phong@codegym.vn", 22));
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount())
                    && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}