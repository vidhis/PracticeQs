package com.belcar.array;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testParseEx1 {

	@Test
	public void hasRepeats(){
	
		Assert.assertFalse("String has repeats",ParseStringEx1.CheckString("This is"));
		
	}
	
	@Test
	public void hasRepeats1(){		
		Assert.assertTrue("String does not have repeats",ParseStringEx1.CheckString("This"));

	}
	
	@Test
	public void hasRepeats2(){
		Assert.assertTrue("String does not have repeats 2",ParseStringEx1.CheckString(""));

	}
}
