package telran.numbers.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static telran.numbers.Calculator.*;

class CalculatorTest {

//1
	@Test
	void testMultiply() {
		assertEquals(4, multiply(2, 2));
		assertEquals(-4, multiply(2, -2));
		assertEquals(4, multiply(-2, -2));
	}

//2
	@Test
	void testSum() {
		assertEquals(4, sum(2, 2));
		assertTrue(sum(2, 2) > 0);
		assertFalse(sum(2, -10) >= 0);
		assertEquals(4, sum(3, 1));
		assertEquals(2, sum(3, -1));
	}

//3
	@Test
	void testSubtract() {
		assertEquals(2, subtract(4, 2));
		assertEquals(-2, subtract(2, 4));
	}

//4
	@Test
	void testDivide() {
		assertEquals(0, divide(0, 10));
		assertEquals(1, divide(4, 3));
		assertEquals(0, divide(3, 4));
	}

//5
	@Test
	@Disabled
	void testDivideZero() {
//		assertThrows(null, null);
		assertEquals(0, divide(10, 0));
	}

//6
	@Test
	void testRemainder() {
		assertEquals(3, remainder(3, 4));
		assertEquals(0, remainder(12, 3));
	}

}
