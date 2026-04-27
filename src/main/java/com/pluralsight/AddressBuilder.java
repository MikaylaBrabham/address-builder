package com.pluralsight;
// import scanner
import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {
        // create a new Scanner
        Scanner scanner = new Scanner(System.in);

        // Gather User First name
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Gather User last name
        System.out.println("Enter your last name: ");
        // Gather User Last name
        String lastName = scanner.nextLine();


        // create a string builder for billing details
     StringBuilder billing = new StringBuilder();
        // Gather User Billing address details

        System.out.print("Enter Street: ");
        billing.append(scanner.nextLine()).append(", ");

        System.out.print("Enter City: ");
        billing.append(scanner.nextLine()).append(", ");

        System.out.print("Enter State: ");
        billing.append(scanner.nextLine()).append(", ");

        System.out.print("Enter Zipcode: ");
        billing.append(scanner.nextLine()).append(", ");

        // create a string builder for shipping details
        StringBuilder shipping = new StringBuilder();
        // Gather User shipping address details

        System.out.print("Enter Street: ");
        shipping.append(scanner.nextLine()).append(", ");

        System.out.print("Enter City: ");
        shipping.append(scanner.nextLine()).append(", ");

        System.out.print("Enter State: ");
        shipping.append(scanner.nextLine()).append(", ");

        System.out.print("Enter Zipcode: ");
        shipping.append(scanner.nextLine()).append(", ");



        // print name to screen
        System.out.println("Full Name: " + firstName + " " + lastName);

       // System.out.println("What is your billing address?");
        //String billing

    }
}
