package com.management.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.management.model.Blood;


public class BloodDao 
{
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    
	  public void saveBlood(Blood blood) {
	    Transaction tx = null;
	    try (Session session = sessionFactory.openSession()) 
	    {
	      tx = session.beginTransaction();
	      session.save(blood);
	      tx.commit();
	    } catch (Exception e) {
	      if (tx != null) {
	        tx.rollback();
	      }
	      e.printStackTrace();
	    }
	  }
	  
	  public void updateUser(Blood blood) 
		{
	        Transaction tx = null;
	        try (Session session = sessionFactory.openSession()) 
	        {
	            // start the transaction
	            tx = session.beginTransaction();

	            // save student object
	            session.saveOrUpdate(blood);

	            // commit the transaction
	            tx.commit();
	        } 
	        catch (Exception e)
	        {
	            if (tx != null)
	            {
	                tx.rollback();
	            }
	        }
	    }
	  public void deleteBlood(Blood id) {
	        Transaction tx = null;
	        Blood blood1 = null;
	        try (Session session = sessionFactory.openSession())
	        {
	            // start the transaction
	            tx = session.beginTransaction();

	            // get student object
	            session.delete(id);
	            //student = session.load(Student.class, id);
	            // commit the transaction
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	               // transaction.rollback();
	            }
	        }

}
}
