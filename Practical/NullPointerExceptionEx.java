package io;

import java.util.Scanner;

public class NullPointerExceptionEx 
{

	public static void main(String[] args)
	{
		Scanner scanner = null; // Initialize scanner as null
        try {
            scanner = new Scanner(System.in); // Create new Scanner object
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt(); // Read input from user
            System.out.println("You entered: " + num);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close(); // Close the scanner in the finally block
            }
        }
}}
