package com.pack.main;

import com.pack.dao.EmployeeDao;
import com.pack.model.Employee;
import java.util.*;

public class MainClass {

	public static void main(String[] args) 
	{
		EmployeeDao dao=new EmployeeDao();
		
		Employee data=new Employee();
		
	data.setEmployeeName("xyz");	
	data.setSalary(20000.0000);
	dao.saveData(data);
	//dao.updateData(data);
//		data.setEmployeeSalary(240000);
//		dao.updateData(data);
//		
//		List<Management> datad=dao.getalldata();
//		datad.forEach(data1 -> System.out.println(data1.getId()));
//		
//		dao.deleteData(data);

	}

}
