package Operatorss;

import java.util.Scanner;

public class ArithmeticOpr
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number:");
		int num1=sc.nextInt();
		System.out.println("enter the 2st number:");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum of these no:"+sum);
		sc.close();
		
	}
}
