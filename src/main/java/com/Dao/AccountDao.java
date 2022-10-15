package com.Dao;

import com.bean.Account;

public interface AccountDao  {
	public Account findById(int id);
	
	String save(Account account);
	String deleteAccountById(int id);
	String withdraw(double amount,int accountId);
	String deposit(double amount,int accountId);
	 
}
