package corejava;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		//printing student data line 
		System.out.println("Student data"+"\n");
		//create a variable to printing student data
		StudentData s1=new StudentData();
		//use the variable of creating student data
		s1.setStudent_id(1);
		s1.setStudent_name("Shaheen");
		s1.setStudent_age(21);
		//printing the data
		System.out.println("Student_ID:"+s1.getStudent_id()+"\n"+"Student_Name:"+s1.getStudent_name()+"\n"+"Student_Age:"+s1.getStudent_age());
		

	}

}
