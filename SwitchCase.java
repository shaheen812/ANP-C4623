package corejava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args)
	{
		// create scanner class to take input from the user
		Scanner sc=new Scanner(System.in);
		int n;
		// start the do loop
		do 
		{
			//give option to print what we want
			 System.out.println("1. Option 1");
	            System.out.println("2. Option 2");
	            System.out.println("3. Option 3");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            //call the object when we create
	    		n =sc.nextInt();
	    		//start switch case where we give multiple case
	    		switch(n)
	    		{
	    		case 1:
                    System.out.println("You selected Option 1.");
                    break;
	    		case 2:
                    System.out.println("You selected Option 2.");
                    break;
	    		case 3:
                    System.out.println("You selected Option 3.");
                    break;
	    		case 4:
                    System.out.println("You selected Option 4.");
                    break;
	    		default:
                    System.out.println("Invalid choice, please try again.");

	    		}
		}
		//give the while condition
		while(n!=4);
		
	}

}
