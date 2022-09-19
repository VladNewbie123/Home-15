package controller;

import java.util.Scanner;

public class ConsoleHandler {
    public static String[] inputUser() {
        String[] infoUser = new String[3];
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("input name: ");
            String name = scan.nextLine();
            System.out.println("input email: ");
            String email = scan.nextLine();
            System.out.println("input password: ");
            String password = scan.nextLine();
            scan.close();
            infoUser[0] = name;
            infoUser[1] = email;
            infoUser[2] = password;
            return infoUser;
        } catch (Exception e) {

        }
        return infoUser;
    }
}
