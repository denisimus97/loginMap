package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PasswordFinder a = new PasswordFinder();

        System.out.print("Enter number of users: ");
        int count = scan.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("User " + i + " - Login: ");
            String login = scan.next();
            System.out.print("User " + i + " - Password: ");
            String password = scan.next();
            a.add(login, password);
        }

        System.out.print("Enter user login: ");
        System.out.println(a.find(scan.next()));
    }
}
