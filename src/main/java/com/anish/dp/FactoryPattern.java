package com.anish.dp;

public class FactoryPattern {
	
	public static Planet getInstance(String name){
		
		if(name.equalsIgnoreCase("moon")){
			return Moon.getInstance();
		}else if(name.equalsIgnoreCase("Earth")){
			return Earth.getInstance();
		}
		return null;
	}
	
}
