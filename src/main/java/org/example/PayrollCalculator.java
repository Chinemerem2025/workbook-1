package org.example;

import java.util.Scanner;


public PayrollCalculator() {
        public static void main(String[] args)
        input = new Scanner(System.in);


            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter hours worked: ");
            float hoursWorked = input.nextFloat();

            System.out.print("Enter pay rate: ");
            float payRate = input.nextFloat();
            
// Calculate gross pay
            float grossPay = hoursWorked * payRate;
            System.out.println("Employee: " + name);
            System.out.println("Gross Pay: $" + grossPay);

            // overtime calculation
    if (hoursWorked > 40) {
        
        System.out.println(" You have overtime" + hoursWorked - overTime);

           input.close();
    }
}
