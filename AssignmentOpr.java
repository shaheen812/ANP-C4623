package Operatorss;

import java.util.Scanner;

public class AssignmentOpr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
	    int num1 = sc.nextInt();

	    System.out.print("Enter another number: ");
	    int num2 = sc.nextInt();

	    System.out.println("Initial value of num1: " + num1);
	    System.out.println("Initial value of num2: " + num2);

	    // Assignment operators example
	    num1 += num2;
	    num2 -= num1;
	    System.out.println("Final value of num1: " + num1);
	    System.out.println("Final value of num2: " + num2);
	    sc.close();
	}

}
