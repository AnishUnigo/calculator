package com.anish.dp;

import org.junit.Test;

import junit.framework.TestCase;

public class EarthTest extends TestCase{
	
	/*@Test
	public void testEarthFailure(){
		
		Earth x=Earth.getInstance();
		Earth y=Earth.getInstance();
		
		assertTrue(x!=y);
	}*/
	
	@Test
	public void testEarthSuccess(){
		
		Earth x=Earth.getInstance();
		Earth y=Earth.getInstance();
		
		assertTrue(x==y);
	}
	
	@Test
	public void testMoonSuccess(){
		
		Planet x=Moon.getInstance();
		Planet y=Moon.getInstance();
		assertTrue(x==y);
	}
}
