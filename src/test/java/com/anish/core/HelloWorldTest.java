package com.anish.core;

import org.junit.Test;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase{
	
	HelloWorld hw=new HelloWorld();
	@Test
	public void testGetMessage(){
		assertEquals(hw.getMessage("Anish"),"Anish");
	}
}
