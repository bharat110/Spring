package com.nw.ars.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nw.ars.beans.Bank;

public class ClientApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nw/ars/config/application-context.xml");
		
		Bank bank = context.getBean("bank", Bank.class);
		
		float intrAmt = bank.calIntrAmt(10000, 20);
		
		System.out.println("Intr Amt  "+intrAmt);
	}
}
