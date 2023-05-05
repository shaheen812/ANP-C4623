package com.maven.dao;

import com.maven.model.HotelManagement;

import java.util.List;

public interface IHotelM 
{
	void saveCustomer(HotelManagement customer);

	void updateCustomer(HotelManagement customer);

	HotelManagement getCustomerById(int id);
	
	List<HotelManagement> getAllCustomer();

	void deleteCustomer(int id);


}
