package io;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionArithmaticEx {

		public class Exceptionh {
		    public static void main(String[] args) {
		    	// use Scanner class user input to enter the number
		        Scanner sc = new Scanner(System.in);
		        double num1, num2, res;

		        System.out.println("Enter the First Number: ");
		        try {
		            num1 = sc.nextDouble();
		        } catch (InputMismatchException e) {  //it give exception when non-numeric value
		            System.out.println("\nInvalid Input!");
		            System.out.println("Error: " + e);
		            return;
		        }

		        System.out.println("Enter the Second Number: ");
		        try {
		            num2 = sc.nextDouble();
		        } catch (InputMismatchException e) {  //it give exception when non-numeric value
		            System.out.println("\nInvalid Input!");
		            System.out.println("Error: " + e);
		            return;
		        }
		        // All arithmetic operation +,-,*,/
		        res = num1 + num2;
		        System.out.println("\nAddition Result = " + res);
		        res = num1 - num2;
		        System.out.println("Subtraction Result = " + res);
		        res = num1 * num2;
		        System.out.println("Multiplication Result = " + res);
		       
		        try {
		        	// it condition given when we dive by 2 give exception
		            if (num2 == 0) {
		                throw new ArithmeticException("Cannot divide by zero");
		            }
		            res = num1 / num2;
		        } catch (ArithmeticException e) {
		            System.out.println("Invalid Input!");
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		}
	}


