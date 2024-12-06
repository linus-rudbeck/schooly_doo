package se.distansakademin;

import se.distansakademin.data.DataSource;
import se.distansakademin.services.LoginService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        Scanner scanner = new Scanner(System.in);
        LoginService loginService = new LoginService();

        SchoolyDooApp app = new SchoolyDooApp(dataSource, scanner, loginService);

        app.start();
    }
}