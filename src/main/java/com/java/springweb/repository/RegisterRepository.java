package com.java.springweb.repository;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.springweb.entity.Register;
import com.mysql.cj.Query;



@Repository
public class RegisterRepository {
   
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Register register) {
		try {
			    Session session=sessionFactory.openSession();
				Transaction transaction=session.beginTransaction();
				session.save(register);
				transaction.commit();
				
			
		} catch (Exception e) {
		     e.printStackTrace();	
		}
		
		
	}
	
	public Register findByEmail(String email) {
		StringBuilder builder=new StringBuilder();
		builder.append("from Register where email=:e");
		Session session=sessionFactory.openSession();
		org.hibernate.query.Query query=session.createQuery(builder.toString());
		query.setParameter("e", email);
		return (Register)query.uniqueResult();
		
	}
	
	public List<Register> findAll() {
		StringBuilder builder=new StringBuilder();
		builder.append("from Register");
		Session session=sessionFactory.openSession();
		org.hibernate.query.Query query=session.createQuery(builder.toString());
		
		return query.getResultList();
		
	}
	
	public Register findById(Long id) {
		StringBuilder builder =new StringBuilder();
		builder.append("from Register");
		Session session= sessionFactory.openSession();
		return session.get(Register.class, id);
	}
}
