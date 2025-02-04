package com.techm;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		
		Student e = new Student();
		e.setStid(101);
		e.setStname("sailaja");
		
		
		session.save(e);
		
		t.commit();
		System.out.println("successfully saved");
		
		factory.close();
		session.close();
		
	}
}
