package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateMain {
	
	private static void createNew() {
		SessionFactory factory=new HiberNateUtils().getSessionFactory();
  
		Session session=factory.openSession();
		Courses c=new Courses(101,"java","ait");
		Courses c1=new Courses(102,"advjava","sunbeam");

		Transaction tx=session.beginTransaction();
		session.save(c);
		session.save(c1);
		
		tx.commit();
		System.out.println("data adeed");
		session.close();
		
		}
	public static void main(String[] args) {
		createNew();
	}

}
