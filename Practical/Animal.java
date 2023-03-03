package corejava;

class Animal 
{
	public void makesound()
	{
		System.out.println("The Animal makes a sound");
	}
}
class Dogss extends Animal
{
	public void makesound()
	{
		System.out.println("Barks...");
	}
}
class Catss extends Animal
{
	public void makesound()
	{
		System.out.println("Meow Meow...");
	}
}
class Small
{
	public static void main(String[] args)
	{
		Animal a=new Animal();
		Dogss d=new Dogss();
		Catss c=new Catss();
		a.makesound();
		d.makesound();
		c.makesound();
		//Creating another object class Animal that refer to 
		//the object of type Dog
		Animal a1=new Dogss();
		a1.makesound();
	}
}