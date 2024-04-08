package com.sp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.sp.entity.Student;

public class Main {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		// Create a SessionFactory Object with the help of Configuration (typically Hibernate).
		SessionFactory sessionFactory = config.buildSessionFactory();

		// Open a new session from the SessionFactory.
		Session session = sessionFactory.openSession();

		// Begin a transaction to perform database operations.
		Transaction tx = session.beginTransaction();

		// Create an instance of the Student class (assuming it exists and is mapped to a database table).
		Student student = new Student();


		//create
		student.setId(103);
		student.setName("sp");

		session.save(student);

		tx.commit();

		session.close();
	}

}
