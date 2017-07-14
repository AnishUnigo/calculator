package com.anish.dp;

public class Moon extends Planet {

	private static Moon moonInstance;
	
	private Moon(String name, int position){
		
		System.out.println("Welcome Zero Gravit");
	}
	
	public static Moon getInstance(){
		
		if(moonInstance==null){
			
			moonInstance=new Moon("Moon",1);
			
		}
		return moonInstance;
	}
}
