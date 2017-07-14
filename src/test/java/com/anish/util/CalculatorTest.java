package com.anish.util;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	Calculator cc = new Calculator();
	
	@Test
	public void testadd(){
		
		assertEquals(cc.add(5, 6),11);
	}
	
	@Test
	public void testsubstract(int x, int y){
		
		assertEquals(cc.substract(5, 4),1);
		
	}
	
	@Test
	public void testmultiply(int x, int y){
		
		assertEquals(cc.multiply(5, 4),45);

	}
	
	@Test
	public void testdiv(int x, int y){
		
		assertEquals(cc.div(5, 5),1);
	}
}
