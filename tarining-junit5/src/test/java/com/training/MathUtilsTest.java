package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 0);
		assertEquals(expected, actual, "The add method should add two numbers");
	}

}
