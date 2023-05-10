package com.pack.dao;

import java.util.*;
import com.pack.model.Employee;

public interface IEmployeeDao
{
	void saveData(Employee staff);
	
	void updateData(Employee staff);
	
	Employee getEmployeeDetail(int id);
	
	List <Employee> getalldata();
	
	void deleteData(int id);
	
	double incrementSalary(int id, double percent);
	
	
	
	

}
