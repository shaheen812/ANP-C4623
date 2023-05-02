package io;
public class NullPointerExceptionNumEx {

	public static void main(String[] args) {
		 String str = null;
	    	
	        try 
	        {
	            // Attempt to access a method on a null object
	        	int l = str.length(); // This will throw a NullPointerException
	        
	        } 
		        catch (NullPointerException e)
		        {
		            System.out.println("Caught NullPointerException: " + e.getMessage());
		        }
		    }
	}