package corejava;

public class TestEncapsulation
{

	public static void main(String[] args) 
	{
		// Creating object of class EncapsulationExample
		EncapsulationExample a=new EncapsulationExample();
		//object is used to access the method of a class
		a.setId(1);
		System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName());

	}

}
