package demo;

import org.testng.annotations.Test;

public class Prac1Test {
	
	@Test(groups = "smoke")
	public void carTest() 
	{
		System.out.println("Benz");
		System.out.println("BMW");
	}

}
