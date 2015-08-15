import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMathTests {
	
	int a[] = null;
	
	@Before
	public void setup() {
		a = new int[]{11, 15 , 2, 3};
	}

	@Test
	public void test_add_valid() {
		MyMath myMath = new MyMath();
		int result = myMath.add(5, 6);
		assertEquals(result, 11);
	}
	
	@Test
	public void test_max_valid() {
		//int a [] = new int[]{11, 15 , 2, 3};
		MyMath myMath = new MyMath();
		int max = myMath.findMax(a);
		assertEquals(max, 15);
		
	}
	
	@Test
	public void test_sort_valid() {
		//int a [] = new int[]{11, 15 , 2, 3};
		int sortedReference [] = new int[]{2, 3, 11, 15};
		MyMath myMath = new MyMath();
		myMath.sort(a);
		assertArrayEquals(a, sortedReference);
	}
	
	
	@Test 
	public void test_add_exception1() {
		try {
			MyMath myMath = new MyMath();
			int result = myMath.add(-5, 6);
			fail("Should have got an UnsupportedOperationException");
		} catch (UnsupportedOperationException e) {
			//Pass - UnsupportedOperationException is expected.
		}
		
	} 
	
	@Test (expected = UnsupportedOperationException.class)
	public void test_add_exception2() {
		MyMath myMath = new MyMath();
		int result = myMath.add(-5, 6);
	}
	
	@After
	public void cleanup() {
		a = null;
	}
	

}
