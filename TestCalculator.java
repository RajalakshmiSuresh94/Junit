package Com.Example.JunitProject;

import org.junit.After;
import org.junit.Before;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;

public class TestCalculator {
	
	Calculator c = new Calculator();
	@Before
    public void show() {
		System.out.println("Welcome");
	}
	@Test
	public void tesdAdd() {
		System.out.println(c.add(10, 15));
	}
	@Test 
	public void testSub() {
		System.out.println(c.sub(25, 10));
	}
	@Test
	public void testmultiply() {
		System.out.println(c.multiply(23, 41));
	}
	@Test
	public void testDivision() {
		System.out.println(c.division(75, 5));
	}
	@After
	public void show2() {
		System.out.println("Thank You");
	}

}
