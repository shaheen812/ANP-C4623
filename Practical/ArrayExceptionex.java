package io;

import java.util.Scanner;

public class ArrayExceptionex {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	        int[] array = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = sc.nextInt();
	        }

	        System.out.print("Enter the index to access: ");
	        int index = sc.nextInt();

	        try {
	            int value = array[index];
	            System.out.println("Value at index " + index + ": " + value);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index out of bounds!");
	        }

	        sc.close();
	    }
	}