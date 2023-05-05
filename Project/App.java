package com.HotelMgmtSyst.HotelManagementSys;

import java.util.List;

import com.maven.dao.HotelM;
import com.maven.model.HotelManagement;


public class App 
{
    public static void main( String[] args )
    {
    	HotelM hm = new HotelM();

    	HotelManagement customer =new HotelManagement( "John", "Doe", "johndoe@example.com",101,123,345,3693);
    	HotelManagement customer3 =new HotelManagement( "mohan", "kumar", "mohan@example.com",301,003,3425,1193);
    	HotelManagement customer1 =new HotelManagement( "sha", "khan", "sha@example.com",103,423,234,2293);
        hm.saveCustomer(customer);
        hm.saveCustomer(customer1);
        hm.saveCustomer(customer3);

        customer.setFirstName("John");
        hm.updateCustomer(customer1);
        

        List <HotelManagement > customers = hm.getAllCustomers();
        customers.forEach(Customer2 -> System.out.println(Customer2.getId()));
        
        hm.deleteCustomer(2);

    }
    }

