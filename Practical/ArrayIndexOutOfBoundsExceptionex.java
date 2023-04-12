package io;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionex {

	public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
      Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index to access: ");
        int index = sc.nextInt();

        try {
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
	}

}
