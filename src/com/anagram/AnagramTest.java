package com.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void test() {
		
		System.out.println(AnagramChecker.CheckforAnagram("", ""));
		System.out.println(AnagramChecker.CheckforAnagram("T", "T"));
		System.out.println(AnagramChecker.CheckforAnagram("I", "S"));
		System.out.println(AnagramChecker.CheckforAnagram("This", "This"));
		System.out.println(AnagramChecker.CheckforAnagram("This", "ihsT"));
		System.out.println(AnagramChecker.CheckforAnagram("Ths", "ihsT"));

		
	}

}
