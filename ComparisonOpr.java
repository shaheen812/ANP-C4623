package Operatorss;

import java.util.Scanner;

public class ComparisonOpr
{

	public static void main(String[] args)
	{
		//create Scanner class to user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int num1=sc.nextInt();
		System.out.println("Enter the 2st number:");
		int num2=sc.nextInt();
		if ( num1 == num2 )           
            System.out.printf( "%d == %d\n", num1, num2 ); 
		if ( num1 < num2 )          
            System.out.printf( "%d < %d\n", num1, num2 );  
        if ( num1 > num2 )          
            System.out.printf( "%d > %d\n", num1, num2 );  
        if ( num1 <= num2 )          
            System.out.printf( "%d <= %d\n", num1, num2 );  
        if ( num1 >= num2 )          
            System.out.printf( "%d >= %d\n", num1, num2 );    
		sc.close();
	}
}


