package com.account.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDoaImpl;

public class AddAmountUseCase {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter your id");
		int id  = sc.nextInt();
		System.out.println("Enter your Amount");
		double amount  = sc.nextDouble();
		AccountDao ad = new AccountDoaImpl();
	String res= 	ad.deposit( amount, id);
	System.out.println(res);
	
	
		

	}

}
