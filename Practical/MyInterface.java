package corejava;

interface MyInterface
{
public void doSomething();// interface method (does not have a body)
}
class MyClass implements MyInterface //creating class
{
	public void doSomething()
	{
		System.out.println("Doing Something...");
	}
}
class MyMain//creating class with main method() 
{
	public static void main(String []args) 
	{
		MyClass d=new MyClass();
		d.doSomething();
	}
	
}