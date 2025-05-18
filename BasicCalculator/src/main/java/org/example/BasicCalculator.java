package org.example;


import java.util.Scanner;

public class BasicCalculator {
    private final Scanner input;

    public BasicCalculator() {
        input = new Scanner(System.in);
    }

    public void menu() {
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();


        System.out.println("Choose from the options:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String calculator = input.next();

        switch (calculator) {
            case "A" -> {
                int result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            }
            case "S" -> {
                int result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }
            case "M" -> {
                int result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            }
            case "D" -> {
                int result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);

            }
        }


    }
}


