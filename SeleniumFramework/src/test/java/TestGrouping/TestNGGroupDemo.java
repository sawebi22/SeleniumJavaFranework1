package TestGrouping;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class TestNGGroupDemo {
	
	@Test(groups = {"Sanity"})
	public void test1() {
		System.out.println("this is Test 1");
	}
	
	@Test(groups = {"windows.regression"})
	public void test2() {
		System.out.println("this is Test 2");
	}
	
	@Test(groups = {"linux.regression"})
	public void test3() {
		System.out.println("this is Test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("this is Test 4");
	}

}
