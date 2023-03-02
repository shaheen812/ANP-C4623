package corejava;

class Animal 
{
	//method
	public void display()
	{
		System.out.println("Inside a parent class");
	}
	
}
//child class
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Barks....");
	}
}
class Puppy extends Dog
{
	public void run() 
	{
	System.out.println("He runs by small steps...");
	}
}
// main class to test here
class Tester
{
	public static void main(String args[])
	{
// create object of child class
		Puppy a=new Puppy();
		a.display();
		a.sound();
		a.run();
	}
}
