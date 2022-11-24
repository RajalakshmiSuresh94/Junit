package Com.Example.JunitProject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertClassProgram {
	@Test
	public void asserEq() {
		assertEquals(5, 5);
	}
	@Test
	public void assertNotEq() {
		assertNotEquals(2, 7);
	}
	@Test
		public void testAsserNull() {
			assertNull(null);
		}
		@Test
		public void testAssertNotNUll() {
			assertNotNull("Raji");
		}
		@Test 
		public void assertCheckTrue() {
			boolean val=7!=8;
			assertTrue(val);
		}
		@Test 
		public void testCheckFalse() {
			boolean val1 =8==6;
			assertFalse(val1);
		}
		@Test 
		public void testAssetSame() {
			assertSame("Raji","Raji");
		}
		@Test
		public void testAssertNotSame() {
			assertNotSame("Nisha","onesoft");
		}
		@Test
		public void testArrayEquals() {
			int [] nums1= {5,7,9};
			int [] nums2= {5,7,9};
			assertArrayEquals(nums1,nums2);
		}
	}


