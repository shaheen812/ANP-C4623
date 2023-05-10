package com.pack.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.pack.model.Employee;



public class EmployeeDao 
{
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    
	  public void saveData(Employee staff) {
	    Transaction tx = null;
	    try (Session session = sessionFactory.openSession()) 
	    {
	      tx = session.beginTransaction();
	      session.save(staff);
	      tx.commit();
	    } catch (Exception e) {
	      if (tx != null) {
	        tx.rollback();
	      }
	      e.printStackTrace();
	    }
	  }
	  
	  public void updateData(Employee data) {
		    Transaction tx = null;
		    try (Session session = sessionFactory.openSession()) 
		    {
		      tx = session.beginTransaction();
		      session.saveOrUpdate(data);
		      tx.commit();
		    } catch (Exception e) {
		      if (tx != null) {
		        tx.rollback();
		      }
		      e.printStackTrace();
		    }
		  }
	  public Employee getEmployeeDetail(int id) {
		    Transaction tx = null;
		    Employee data=null;
		    try (Session session = sessionFactory.openSession()) 
		    {
		      tx = session.beginTransaction();
		      data=session.get(Employee.class, id);
		      tx.commit();
		    } catch (Exception e) {
		      if (tx != null) {
		        tx.rollback();
		      }
		      e.printStackTrace();
		    }
		    return data;
		  }
	 
	    public List < Employee > getalldata() 
		{
		  Transaction transaction = null;
	        List < Employee > datad = null;
	        try (Session session = sessionFactory.openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            // get employees
	            datad = session.createQuery("from Employee").list();
	            
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	        }
	        return datad;
		}
	  public void deleteData(int id) {
		    Transaction tx = null;
		    try (Session session = sessionFactory.openSession()) 
		    {
		      tx = session.beginTransaction();
		      session.delete(id);
		      tx.commit();
		    } catch (Exception e) {
		      if (tx != null) {
		        tx.rollback();
		      }
		      e.printStackTrace();
		    }
		  }
	  
	  public double incrementSalary(int id, double percent) {
		  Transaction tx = null;
			Employee employee = null;
			try (Session session = sessionFactory.openSession())  {
				// start a transaction
				tx = session.beginTransaction();
				// get an employee object
				employee = session.get(Employee.class, id);

				employee.setSalary(employee.getSalary()+employee.getSalary()*percent/100);
		
				session.update(employee);
				
				tx.commit();
			} catch (Exception e) {
				if (tx != null) {
					tx.rollback();
				}
				e.printStackTrace();
			}
			return employee.getSalary();
		    
		  }
	  
	  

}
