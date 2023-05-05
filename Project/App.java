package com.management.main;

import com.management.dao.BloodDao;
import com.management.model.Blood;

public class App
{

	public static void main(String[] args) 
	{
		BloodDao dao = new BloodDao();	    
	    // Create a new user entity
	    Blood blood = new Blood();
	    blood.setName("John Smith");
	    blood.setBloodGroup("B+");
	   dao.saveBlood(blood);
	    
	    blood.setName("abc xyz");
	    blood.setBloodGroup("AB+");
	    dao.updateUser(blood);
	    dao.deleteBlood(blood);
	}

}
