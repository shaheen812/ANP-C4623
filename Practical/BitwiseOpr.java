package Operatorss;

import java.util.Scanner;

public class BitwiseOpr
{

	public static void main(String[] args)
	{
		//Take input from the user
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number:");
				int num1=sc.nextInt();
				System.out.println("Enter Second number:");
				int num2=sc.nextInt();
				//Apply bitwise AND operator
				int and =num1 & num2;
				System.out.println(num1 +"&"+num2+"="+and);
				//Apply bitwise OR operator
				int or =num1 | num2;
				System.out.println(num1 +"|"+num2+"="+or);
				//Apply bitwise XOR operator
				int xor =num1 ^ num2;
				System.out.println(num1 +"^"+num2+"="+xor);
				//Apply bitwise Not operator
				int not =~num1;
				System.out.println("~"+num1 +"="+not);
				//Apply bitwise Not operator
				int not2 =~num2;
				System.out.println("~"+num2 +"="+not2);
				sc.close();
	}

}
