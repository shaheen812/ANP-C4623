package corejava;
import java.util.Scanner; 
public class TableEx 
{
	public static void main(String[] args)
	{
		// take input from the user
		Scanner sc = new Scanner(System.in);  
		//print that value
		System.out.print("Enter number: ");       
		//reading a number whose table is to be print  
		int num=sc.nextInt();  
		//loop start execution form and execute until the condition i<=10 becomes false  
		for(int i=1; i <= 10; i++)  
		{  
		//prints table of the entered number      
		System.out.println(num+" * "+i+" = "+num*i);  
		}
	}
}