package com.maven.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	
	public class HotelManagement 
	{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int Id;

	    @Column(name = "first_name")
	    private String FirstName;

	    @Column(name = "last_name")
	    private String LastName;

	    @Column(name = "email")
	    private String Email;

	    @Column(name = "room_number")
	    private int RoomNumber;

	    @Column(name = "price_per_night")
	    private int PricePerNight;

	    @Column(name = "price_per_day")
	    private int PricePerDay;

	   
	    @Column(name = "customer_phone_number")
	    private int CustomerPhoneNumber ;


		public int getId() {
			return Id;
		}


		public void setId(int id) {
			Id = id;
		}


		public String getFirstName() {
			return FirstName;
		}


		public void setFirstName(String firstName) {
			FirstName = firstName;
		}


		public String getLastName() {
			return LastName;
		}


		public void setLastName(String lastName) {
			LastName = lastName;
		}


		public String getEmail() {
			return Email;
		}


		public void setEmail(String email) {
			Email = email;
		}


		public int getRoomNumber() {
			return RoomNumber;
		}


		public void setRoomNumber(int roomNumber) {
			RoomNumber = roomNumber;
		}


		public int getPricePerNight() {
			return PricePerNight;
		}


		public void setPricePerNight(int pricePerNight) {
			PricePerNight = pricePerNight;
		}


		public int getPricePerDay() {
			return PricePerDay;
		}


		public void setPricePerDay(int pricePerDay) {
			PricePerDay = pricePerDay;
		}


		public int getCustomerPhoneNumber() {
			return CustomerPhoneNumber;
		}


		public void setCustomerPhoneNumber(int customerPhoneNumber) {
			CustomerPhoneNumber = customerPhoneNumber;
		}


		public HotelManagement() 
		{
			
		}


		public HotelManagement( String firstName, String lastName, String email, int roomNumber,
				int pricePerNight, int pricePerDay, int customerPhoneNumber) {
			super();
		
			FirstName = firstName;
			LastName = lastName;
			Email = email;
			RoomNumber = roomNumber;
			PricePerNight = pricePerNight;
			PricePerDay = pricePerDay;
			CustomerPhoneNumber = customerPhoneNumber;
		}


	    // Getters and setter

	  //default constructor
		
		}
