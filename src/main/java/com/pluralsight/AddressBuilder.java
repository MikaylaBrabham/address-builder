package com.pluralsight;
// import scanner
import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {
        // create a new Scanner
        Scanner scanner = new Scanner(System.in);

        // Gather User First name
        System.out.println("Enter your full name: ");
        String fullName = scanner

        // Gather User Last name


        // create a string builder for billing details
     StringBuilder billing = new StringBuilder();
        // Gather User Billing address

        billing.append("Street, ");
        billing.append("City, ");
        billing.append("State, ");
        billing.append("Zip, ");

        // create a string builder for billing details
        StringBuilder shipping = new StringBuilder();
        // Gather User Billing address

        shipping.append("Street, ");
        shipping.append("City, ");
        shipping.append("State, ");
        shipping.append("Zip, ");


        System.out.println("What is your billing address?");
        String billing

    }
}
