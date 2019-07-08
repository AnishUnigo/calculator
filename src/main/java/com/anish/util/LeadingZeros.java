package com.anish.util;

public class LeadingZeros {
	
	private String replaceLeadingZeros() {
		
		String str = "00023456789-9870";
		
		System.out.println(str.replace("^0+(?!$)", ""));
		
		return str;
	}
}
