package com.sp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sp.entity.Student;

public class UpdateRecord {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student studentUpdate=session.get(Student.class, 102);
		//studentUpdate.setId(106);
		studentUpdate.setName("Priyanshi");
		
		session.save(studentUpdate);
		tx.commit();
		session.close();
	}
}
