package com.replacespace;

import static org.junit.Assert.*;

import org.junit.Test;

public class Replaceby20Test {

	@Test
	public void test() {
		
		System.out.println(Replaceby20.ReplaceSpaceBy20(""));
		System.out.println(Replaceby20.ReplaceSpaceBy20("T"));
		System.out.println(Replaceby20.ReplaceSpaceBy20("T T"));
		System.out.println(Replaceby20.ReplaceSpaceBy20("T H "));
		System.out.println(Replaceby20.ReplaceSpaceBy20(" T "));
		System.out.println(Replaceby20.ReplaceSpaceBy20("This is "));
		System.out.println(Replaceby20.ReplaceSpaceBy20(" This is "));
		System.out.println(Replaceby20.ReplaceSpaceBy20("This is"));

	}

}
