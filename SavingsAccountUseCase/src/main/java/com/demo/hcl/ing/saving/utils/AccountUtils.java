package com.demo.hcl.ing.saving.utils;

import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class AccountUtils {
	public Long generateNewAccountNumber() {
		Random rnd = new Random();
		char[] digits = new char[11];
		digits[0] = (char) (rnd.nextInt(9) + '1');
		for (int i = 1; i < digits.length; i++) {
			digits[i] = (char) (rnd.nextInt(10) + '0');
		}
		return Long.parseLong(new String(digits));
	}
	
	public String generateCustomerId() {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(7);
		
		for (int i = 0; i < 7; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
			return sb.toString();

	}
	
	public Long generateNewTransactionId() {
		Random rnd = new Random();
		char[] digits = new char[11];
		digits[0] = (char) (rnd.nextInt(9) + '1');
		for (int i = 1; i < digits.length; i++) {
			digits[i] = (char) (rnd.nextInt(10) + '0');
		}
		return Long.parseLong(new String(digits));
	}

}