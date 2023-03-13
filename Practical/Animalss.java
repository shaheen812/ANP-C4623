package corejava;

interface Animalss
{
public void sound();// interface method (does not have a body)
}
class Monkey implements Animalss //creating class
{
	//The body of  interface method of animalSound()
	public void sound() 
	{
	System.out.println("huphup...");	
	}
}
class AnimalssMain//creating class with main method()
{
	public static void main(String[] args)
	{
		Monkey m=new Monkey();//Creating a object of class Monkey
		m.sound();//calling method of interface
	}
}