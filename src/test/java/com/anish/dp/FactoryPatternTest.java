package com.anish.dp;

import org.junit.Test;

import junit.framework.TestCase;

public class FactoryPatternTest extends TestCase{
	
	@Test
	public void testMoon(){
		assertEquals(FactoryPattern.getInstance("Moon"),Moon.getInstance());
	}
	
	@Test
	public void testEarth(){
		assertTrue(FactoryPattern.getInstance("Earth")==Earth.getInstance());
	}
	
	
}
