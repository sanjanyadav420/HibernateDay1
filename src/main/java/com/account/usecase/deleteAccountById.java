package com.account.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDoaImpl;

public class deleteAccountById {

	public static void main(String[] args) {
		 
		AccountDao ad = new AccountDoaImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id ");
		int id = sc.nextInt();
		
	String res= 	ad.deleteAccountById(id);
		System.out.println(res);

	}

}
