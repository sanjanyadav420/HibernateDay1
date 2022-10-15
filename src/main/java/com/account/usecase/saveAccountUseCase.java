package com.account.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDoaImpl;
import com.bean.Account;

public class saveAccountUseCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Data");
		System.out.println( "Enter account id");
		int id  = sc.nextInt();
		System.out.println("Enter your email id");
		String email = sc.next();
		System.out.println("Enter your address");
		String add = sc.next();
		System.out.println("Enter your balance");
		double bala= sc.nextDouble();
		 Account a1 = new Account();
		 a1.setId(id);
		 a1.setEmail(email);
		 a1.setAddress(add);
		 a1.setBalance(bala);
		AccountDao  ad = new AccountDoaImpl() ;
		ad.save(a1);
		System.out.println(a1);
		

	}

}
