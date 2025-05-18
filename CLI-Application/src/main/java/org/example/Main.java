package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for customer code
        System.out.print("Enter customer code: ");
        String customer = scanner.nextLine();

        // Check if the code starts with 'C' or 'c'
        if (customer.startsWith("C")) {
            System.out.println("Good customer code");
        } else {
            System.out.println("Wrong customer code. It should start with a 'C'");
        }



        scanner.close();
    }
}