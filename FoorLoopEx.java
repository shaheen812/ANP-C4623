package corejava;
import java.util.Scanner;
public class FoorLoopEx {
	
		public static void main(String[] args) {
			//Creating a scanner class to take input from user
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the number of times you want to print 'Happy Holi.....'");
					//Creating a variable using scanner class object
					int number=sc.nextInt();
					for(int i=0;i<number;i++)
					{
						System.out.println("Happy Holi......");
					}
					}
					
		}


