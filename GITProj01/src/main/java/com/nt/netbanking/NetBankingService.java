package com.nt.netbanking;

import java.util.Random;

public class NetBankingService {

	
	public String openAccount(String addhar,double initialamount,String type) {
		return"account is opened with acc number::"+new Random().nextLong(5000000000000L);					
	}
	
public String transferMoney(long srcAcno,long destAcno, double amount) {
		
		return null;
	}
	
	public String closeAccount() {
		return "Account is closed";
	}
}
