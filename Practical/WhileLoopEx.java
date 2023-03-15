package corejava;
import java.util.Scanner;
public class WhileLoopEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the Number between 1 and 10");
		 i=sc.nextInt();
		while(i<1 || i>10)
		{
			System.out.println("Invalid input please enter the number between 1 and 10:");
			System.out.println("enter 1 and 10:");
			 i=sc.nextInt();

			
		}
		System.out.println("You enter a number:"+i);
	}

}
