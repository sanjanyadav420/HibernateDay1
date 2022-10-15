package com.account.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDoaImpl;
import com.bean.Account;

public class findByIdUseCase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		AccountDao ad = new AccountDoaImpl();
		
		System.out.println("Enter your id ");
		int id = sc.nextInt();
	Account a =	ad.findById(id);
  if(a==null) {
	  System.out.println("Record not found with this id");
  }else {
	  System.out.println(a);
  }

	}

}
