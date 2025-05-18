package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("Enter pay rate: ");
        float payRate = scanner.nextFloat();

// Calculate gross pay
        float grossPay = hoursWorked * payRate;
        System.out.println("Employee: " + name);
        System.out.println("Gross Pay: $" + grossPay);

        // overtime calculation
        if (hoursWorked > 40) {
            float overTime = hoursWorked - 40;
            double overtimePay = overTime * payRate * 1.5;
            System.out.println("You have " + overTime + " overtime pay");
            System.out.println("Your overtime pay is: " + overtimePay);
            System.out.println();

            scanner.close();
        }
    }
}