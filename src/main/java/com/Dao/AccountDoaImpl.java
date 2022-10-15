package com.Dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Account;

public class AccountDoaImpl implements AccountDao{

	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public Account findById(int id) {
	
	Account a = em.find(Account.class, id);
	
	em.close();
	return a;
		
	}


	@Override
	public String save(Account account) {
		String message = "account Data Added Successfully";
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(account);
		et.commit();
		em.close();
		return message;
	}


	@Override
	public String deleteAccountById(int id) {
	String message = "Account id Not Fountd ";
		Account act = em.find(Account.class, id);
		 if(act!=null) {
			 em.getTransaction().begin();
			 em.remove(act);
			 em.getTransaction().commit();
			 em.close();
		 
			  message = "Account Deleted Successfully";
		 }
		 return message;
		
		
	}


	@Override
	public String withdraw(double amount, int accountId) {
		String message = "Amount Withdraw successfully";
		 Account a = em.find(Account.class, accountId);
		 
		 em.getTransaction().begin();
		 a.setBalance(a.getBalance()- amount);
		 em.getTransaction().commit();
		 em.close();
		 
		 
		 
		 return message;
	}


	@Override
	public String deposit(double amount, int accountId) {
		 String message = "Amount Added successfully";
		 Account a = em.find(Account.class, accountId);
		 
		 em.getTransaction().begin();
		 a.setBalance(a.getBalance()+ amount);
		 em.getTransaction().commit();
		 em.close();
		 
		 
		 
		 return message;
	
	}
	
	

}
