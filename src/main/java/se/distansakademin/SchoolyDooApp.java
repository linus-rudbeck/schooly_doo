package se.distansakademin;

import se.distansakademin.data.DataSource;
import se.distansakademin.models.User;
import se.distansakademin.services.LoginService;

import java.util.Scanner;

public class SchoolyDooApp {

    DataSource dataSource;
    Scanner scanner;
    LoginService loginService;

    User currentUser;

    public SchoolyDooApp(DataSource dataSource, Scanner scanner, LoginService loginService) {
        this.dataSource = dataSource;
        this.scanner = scanner;
        this.loginService = loginService;
    }

    public void start() {
        doLogin();
    }

    private void doLogin() {
        while (true) {
            showLoginScreen();

            String username = getLoginUsername();
            String password = getLoginPassword();
            User user = loginService.login(username, password);

            if (user != null) {
                currentUser = user;
                System.out.println("Login successful");
                return;
            }

            System.out.println("Incorrect credentials!");
        }

    }

    private void showLoginScreen() {
        System.out.println(" --------- ");
        System.out.println(" - Login - ");
        System.out.println(" --------- ");
    }

    private String getNextLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private String getLoginUsername() {
        return getNextLine("Enter username: ");
    }

    private String getLoginPassword() {
        return getNextLine("Enter password: ");
    }
}
