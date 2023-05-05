package com.maven.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.maven.model.HotelManagement;
import com.maven.util.HibernateUtil1;

public class HotelM implements IHotelM
{
	public void saveCustomer(HotelManagement customer) 
	{
		 Transaction transaction = null;
	        try (Session session = HibernateUtil1.getSessionFactory().openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();
	            session.save(customer);

            // commit the transaction
	            transaction.commit();
        }
        catch (Exception e) 
        {
            if (transaction != null) 
            {
                transaction.rollback();
            }
        }
    }
	public void updateCustomer(HotelManagement customer) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil1.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(customer);

            // commit the transaction
            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
    }
	public HotelManagement getCustomerById(int id) 
	{
        Transaction transaction = null;
        HotelManagement customer1 = null;
        try (Session session = HibernateUtil1.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get student object
            customer1 = session.get(HotelManagement.class, id);
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
        return customer1;
    }
	//indicates the named complier warning should be suppressed
	@SuppressWarnings("unchecked")
    public List <HotelManagement> getAllCustomers() 
	{
        Transaction transaction = null;
        List < HotelManagement > customers = null;
        try (Session session = HibernateUtil1.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            customers = session.createQuery("from HotelManagement").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return customers;
    }
	public void deleteCustomer(int id) {
        Transaction transaction = null;
        HotelManagement customer1 = null;
        try (Session session = HibernateUtil1.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            customer1 = session.get(HotelManagement.class, id);
            // get student object
            session.delete(customer1);
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
               // transaction.rollback();
            }
        }
    }
}


