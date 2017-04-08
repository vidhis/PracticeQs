package com.vidhi.practice;

public class MockEg {

	@Test
	public void TestMock(){
		
		Iterator i = mock(Iterator.class);
		when(i.next()).thenReturn("Hi").thenReturn("World");
		
		
	}
	
	
}
