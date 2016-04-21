package com.codeclan.md;

import static org.junit.Assert.*;

import org.junit.Test;

public class BearTest {

	
	@Test
	public void testBearCanEatFish(){
		Bear bear1 = new Bear();
		Fish fish1 = new Fish();
		bear1.eat(fish1);
		assertEquals(fish1, bear1.stomach.get(0));
		
	}
	

	
}
