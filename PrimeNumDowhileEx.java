package corejava;
import java.util.Scanner;

public class PrimeNumDowhileEx {

	public static void main(String[] args)
	{
		// Creating scanner to take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a;
		a=sc.nextInt();
		do
		{
			System.out.println(a + " is a prime number");
            a++;
		}
		//use while loop to give particular condition
		while(a%2==1);
        //use to give condition
        if(a%2==1)
        {
        	//do loop use to first print the Statement and hen check the condition
        do
        { 
            System.out.println(a+ " is NOT a prime number");
            a++;
        }
        while (a%2==0);
        }
		
		
	}

}