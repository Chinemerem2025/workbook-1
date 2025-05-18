package org.example;


import java.util.Scanner;

public class BasicCalculator {
    private final Scanner input;

    public BasicCalculator() {
        input = new Scanner(System.in);
    }

    public void menu() {
        System.out.print("Enter the first number: ");
        float firstNumber = input.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumber = input.nextFloat();


        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String operation = input.next();

        if(operation.equals('A')) {
            float result = firstNumber * secondNumber;
            System.out.println(firstNumber +" * "+secondNumber +" = "+result);
        }





    }
}
