package io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class newException
{

	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		try
		{
			num1=sc.nextInt();
			
		}
		catch(InputMismatchException e)
		{
		 System.out.println("Error:InvalidInput");
		 System.out.println("Error"+ e);
		 return;
		}
		System.out.println("Enter the 2st number:");
		try
		{
			num2=sc.nextInt();
			
		}
		catch(InputMismatchException e)
		{
		 System.out.println("Error:InvalidInput");
		 System.out.println("Error"+ e);
		 return;
		}
		int sum=num1+num2;
		System.out.println("add:"+sum);
		int sub=num1-num2;
		System.out.println("add:"+sub);
		int mult=num1*num2;
		System.out.println("add:"+mult);

		sc.close();
	}

}
