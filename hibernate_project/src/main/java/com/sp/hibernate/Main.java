package com.sp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.sp.entity.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction tx=  session.beginTransaction();
		Student student=new Student();
		
		student.setId(103);
		student.setName("sp");
		
		
		session.save(student);
		
		tx.commit();
		
		session.close();
	}

}
