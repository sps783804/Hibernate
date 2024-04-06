package com.sp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sp.entity.Student;

public class DeleteRecord {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student student=session.get(Student.class,101);
		
		System.out.println(student);
		session.delete(student);
		tx.commit();
		session.close();
		
	}

}
