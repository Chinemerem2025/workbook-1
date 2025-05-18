package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//  Ask for Username and password
        System.out.println( "Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password");
        String password = scanner.nextLine();

        if (!username.isEmpty() && !(!password.equals("secret123"))) {
            System.out.println("Access granted, welcome " + username + "!");
        } else {
            System.out.println("Access denied – invalid credentials.");
            System.out.println();
        }

// This is a different scenario, not for the SandwichShop.
        System.out.println("Enter years of experience");
        int Experience = scanner.nextInt();

        System.out.println("Enter the number of programing language you know");
        int Language = scanner.nextInt();

        if (Experience > 5 && Language > 3) {
            System.out.println("You are a senior developer!");
        } else if (Experience > 2 && Experience <= 5 && Language >= 2)
            System.out.println("You are a medior developer");
        else if (Experience < 2 || Language < 2)
            System.out.println("You are a junior developer");

    }
}