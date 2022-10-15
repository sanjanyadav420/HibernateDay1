package com.account.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDoaImpl;

public class widthdrawAmoutUseCase {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Details");
		System.out.println("Enter your Amount");
		double amount= sc.nextDouble();
		System.out.println("Enter your id");
		int id = sc.nextInt();
		
		AccountDao ad = new AccountDoaImpl();
		
		
	String s =	ad.withdraw(amount, id);
	System.out.println(s);

		
	}

}
