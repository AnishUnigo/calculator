package com.anish.dp;

public class Earth extends Planet{
	
	private static Earth earthInstance; 
	
	private Earth(String name, int position){
		
		System.out.println("Thank God !");
	}
	
	public void getPopulation(){
		
		
	}
	
	public static Earth getInstance(){
		
		if(earthInstance==null){
			
			earthInstance= new Earth("Earth", 3);
		}
		
		return earthInstance;
	}
}
