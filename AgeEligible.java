package corejava;
import java.util.Scanner;
public class AgeEligible {

	public static void main(String[] args) {
		//Creating a scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Now your Eligible for vote.");
		}
		else
		{
			System.out.println("You are not Eligible for vote.");
		}
	}

}
