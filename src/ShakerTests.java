import static org.junit.Assert.*;

import org.junit.Test;

public class ShakerTests {

	@Test
	public void test1() {
		int[] falseIntArray = {1,3,2,0,5,4};
		int[] trueIntArray = {0,1,2,3,4,5};
		int[] newIntArray  = Sorting.Sort(falseIntArray);
		assertArrayEquals(trueIntArray, newIntArray);
	}
	
	@Test
	public void test2() {
		int[] falseIntArray = {1,3,4,3,5,4};
		int[] trueIntArray = {1,3,3,4,4,5};
		int[] newIntArray  = Sorting.Sort(falseIntArray);
		assertArrayEquals(trueIntArray, newIntArray);
	}
	
	@Test
	public void test3() {
		int[] falseIntArray = {0,0,1,0,0,0};
		int[] trueIntArray = {0,0,0,0,0,1};
		int[] newIntArray  = Sorting.Sort(falseIntArray);
		assertArrayEquals(trueIntArray, newIntArray);
	}

}
