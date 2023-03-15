package corejava;
import java.util.Scanner;

public class EvenNumWhileEx
{

	public static void main(String[] args)
	{
		// create scanner class to take input from the user

		Scanner sc=new Scanner(System.in);
		int i=2;
		System.out.println("Enter the Number:");
		 int num=sc.nextInt();
		 //use while loop to give a condition
		while(i<=num)
		{
			System.out.println("These are even nuber"+i);
			// use if statement to give condition 
			if(i%2==0) 
			{
				System.out.println(i+"even numer");
			}
			
			i++;
			}
			
	
		}

}


