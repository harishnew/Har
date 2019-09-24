package com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCal {

	@Test
	void test() 
	{
		Cal c1=new Cal();
		assertEquals(6, c1.add(2, 4));
	}

}
