package org.example;
import javax.swing.*;
import java.util.Scanner;


//price
public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double baseRate = 29.99;
        final double GPSFee = 2.95;
        final double tollGate = 3.95;
        final double roadSideAssistance = 3.95;
        final double underAgeCharge = 0.90;

        String pickupDate;
        int rentDays;
        String tollTag;
        String GPS;
        String roadsideAssist;
        int age;


        System.out.println("Enter your pickup date");
        pickupDate = scanner.nextLine();
        System.out.println(" How many days do you need the car"); // if yes base rate *  rentDays = rental fee with no options yet
        rentDays = scanner.nextInt();
        System.out.println("would you want an electronic toll gat3.95"); // if yes, tollTage * rentDays
        tollTag = scanner.nextLine();
        System.out.println("would you want a GPS $2.95");  // if yes, GPSFEE * rentDays
        GPS = scanner.nextLine();
        System.out.println("would you want roadside assistance $3.95"); //if yes, roasideAssist * renDays
        roadsideAssist = scanner.nextLine();
        System.out.println("enter driver age");
        age = scanner.nextInt();




    //Calculate the cost

    double baseCost = rentDays * baseRate; //BaseCost without Options
        double optionsCost = 0;

        if (tollTag.equalsIgnoreCase("yes")) {
            optionsCost += rentDays * tollGate;
        }

        if (GPS.equalsIgnoreCase("yes")) {
            optionsCost += rentDays * GPSFee;
        }

        if (roadsideAssist.equalsIgnoreCase("yes")) {
            optionsCost += rentDays * roadSideAssistance;
        }

        // Additional fee for underage driver
    double underAgeSurcharge = 0;
        if (age < 25) {
        underAgeSurcharge = baseCost * 0.30;
            double totalCost = baseCost + optionsCost + underAgeSurcharge;
            System.out.println();

            System.out.println("\n===== Rental Summary =====");
            System.out.println("Pickup Date: " + pickupDate);
            System.out.println("Rental Days: " + rentDays);
            System.out.printf("Base Cost: $%.2f\n", baseCost);
            System.out.printf("Options Cost: $%.2f\n", optionsCost);
            System.out.printf("Underage Surcharge: $%.2f\n", underAgeSurcharge);
            System.out.printf("Total Cost: $%.2f\n", totalCost);
    }


}
}
