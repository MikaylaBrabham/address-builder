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

        System.out.print("Billing Street: ");
        billing.append(scanner.nextLine()).append("\n ");

        System.out.print("Billing City: ");
        billing.append(scanner.nextLine()).append("\n ");

        System.out.print("Billing State: ");
        billing.append(scanner.nextLine()).append("\n ");

        System.out.print("Billing Zipcode: ");
        billing.append(scanner.nextLine()).append("\n ");

        //created a newline to eneter a space between the two addresses
        System.out.printf("%n");

        // create a string builder for shipping details
        StringBuilder shipping = new StringBuilder();
        // Gather User shipping address details

        System.out.print("Shipping Street: ");
        shipping.append(scanner.nextLine()).append("\n ");

        System.out.print("Shipping City: ");
        shipping.append(scanner.nextLine()).append("\n ");

        System.out.print(" Shipping State: ");
        shipping.append(scanner.nextLine()).append("\n ");

        System.out.print(" Shipping Zipcode: ");
        shipping.append(scanner.nextLine()).append("\n ");

        //created a newline to eneter a space between the two addresses
        System.out.printf("%n");



        // print name to screen
        System.out.println("Full Name: " + firstName + " " + lastName);

       // display billing address
        System.out.println("Billing Address:\n" + billing.toString());

       // display shipping address
        System.out.println("Shipping Address:\n" + shipping.toString());

    }
}
