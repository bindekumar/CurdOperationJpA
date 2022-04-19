package com.binde;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

public class App{
	public static void main(String[] args) {
		//App.insetRecord();
		updateRecord();
	}

//	public static void insetRecord() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("binde");
//		EntityManager em = emf.createEntityManager();
//		Employeeb e = new Employeeb();
//		e.setEmpId(103);
//		e.setEmpName("SAQIEB KUMAR");
//		e.setEmpSal(123.23f);
//		em.getTransaction().begin();
//		em.persist(e);
//		em.getTransaction().commit();
//		em.close();
//		emf.close();
//		System.out.println("INSERT DATA INTO TABLE");
//	}
	public static void updateRecord()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("binde");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
        
      Employeeb s=em.find(Employeeb.class,103);  
      /*  
      System.out.println("Student id = "+s.getEmpId());  
      System.out.println("Student Name = "+s.getEmpName());  
      System.out.println("Student Age = "+s.getEmpSal());
      s.setEmpName("varun kumar");
      */
      /*
      System.out.println("Student id = "+s.getEmpId());  
      System.out.println("Student Name = "+s.getEmpName());  
      System.out.println("Student Age = "+s.getEmpSal());
      */
      
      em.remove(s);
      System.out.println(s);
      System.out.println("Delete is Successfully"); 
      
      t.commit();
      em.close();
      emf.close();
      
      
	}
}
