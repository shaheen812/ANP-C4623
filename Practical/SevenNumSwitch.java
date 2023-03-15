package corejava;

import java.util.Scanner;

public class SevenNumSwitch {

	public static void main(String[] args) 
	{
		//Creating a scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		 int num=7;
			//give option to print what we want
         System.out.println("Enter no 1");
         System.out.println("Enter no 2");
         System.out.println("Enter no 3");
         System.out.println("Enter no 4");
         System.out.println("Enter no 5");
         System.out.println("Enter no 6");
         System.out.println("Enter no 7");
         System.out.println("Enter the number:");
 		num =sc.nextInt();
		//start switch case where we give multiple case
 		switch(num)
 		{
 		case 1:
            System.out.println("sunday.");
            break;
		case 2:
            System.out.println("Monday.");
            break;
		case 3:
            System.out.println("Tuseday.");
            break;
		case 4:
            System.out.println("Wednesday.");
            break;
		case 5:
            System.out.println("thusrady.");
            break;
		case 6:
            System.out.println("Friday.");
            break;
		case 7:
            System.out.println("saturday.");
            break;
		default:
            System.out.println("Invalid choice, please try again.");
 		}
//use while loop to give condition
	
	while(num!=7);
	}
	
}

