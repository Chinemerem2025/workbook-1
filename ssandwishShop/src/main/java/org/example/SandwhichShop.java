package org.example;

import java.util.Scanner;


public class SandwhichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter sandwich size (1 for Regular, 2 for Large): ");
        int size = scanner.nextInt();



        if (size == 1) {
            double RegularBestPrice = 5.45;

        } else if (size == 2) {
            double LargeBestPrice = 8.95;

        } else {
            System.out.println("Invalid sandwich size selected");
        }


// Customer age for discount eligibility
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        double regulardiscount = 0.0;
        double largeDiscount = 0.00;
        double RegularBestPrice = 5.45;
        double LargeBestPrice = 8.95;

//     for regular
        if (age <= 17) {
            regulardiscount = 0.10; // 10% for students
        } else if (age >= 65) {
             regulardiscount = 0.20; // 20% for seniors
        }

        double totalPrice = RegularBestPrice - (RegularBestPrice * regulardiscount);

        System.out.printf("Your Regular sandwich total is: $%.2f\n", totalPrice);
        System.out.println();


    // for Large
      if (age <= 17) {
          largeDiscount = 0.10; // 10% for students

      } else if (age >= 65)
        largeDiscount = 0.20; // 20% for seniors

        double LargetotalPrice = LargeBestPrice - (LargeBestPrice * largeDiscount);
        System.out.printf("Your Large sandwich total is: $%.2f\n", LargetotalPrice);
    }
}
