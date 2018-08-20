package cn.nuaa.ai.test;
/**
 * creat by aile, id: SX1716070
 * */
import static org.junit.Assert.*;

import org.junit.Test;

import cn.nuaa.ai.main.Claculate;

public class ClaculateTest {

	@Test
	public void testAdd() {
		assertEquals(4, new Claculate().add(1, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(4, new Claculate().subtract(9, 5));
	}

	@Test
	public void testMultiply() {
		assertEquals(12, new Claculate().multiply(2, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		assertEquals(3, new Claculate().divide(9, 0));
	}

}
