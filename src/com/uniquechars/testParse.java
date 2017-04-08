package com.uniquechars;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testParse {

	@Test
	public void hasRepeats(){
	
		Assert.assertFalse("String has repeats",ParseString.CheckString("This is"));
		
	}
	
	@Test
	public void hasRepeats1(){		
		Assert.assertTrue("String does not have repeats",ParseString.CheckString("This"));

	}
	
	@Test
	public void hasRepeats2(){
		Assert.assertTrue("String does not have repeats 2",ParseString.CheckString(""));

	}
}
