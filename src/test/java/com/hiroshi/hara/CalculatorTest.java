package com.hiroshi.hara;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addtionで3と5の加算結果が得られる() throws Exception {
		// SetUp
		Calculator sut = new Calculator();
		// Exercise
		int actual = sut.addtion(3, 5);
		// Verify
		assertThat(actual, is(8));
	}
	
	@Test
	public void subtractionで7と4の減算結果が得られる() throws Exception {
		// SetUp
		Calculator sut = new Calculator();
		// Exercise
		int actual = sut.subtraction(7, 4);
		// Verify
		assertThat(actual, is(3));
	}
	
	@Test
	public void multiplicationで3と5の乗算結果が得られる() throws Exception {
		// SetUp
		Calculator sut = new Calculator();
		// Exercise
		int actual = sut.multiplication(3, 5);
		// Verify
		assertThat(actual, is(15));
	}
	
	@Test
	public void divisionで9と3の除算結果が得られる() throws Exception {
		// SetUp
		Calculator sut = new Calculator();
		// Exercise
		double actual = sut.division(9, 3);
		// Verify
		assertThat(actual, is(3.0));
	}
	
	@Test(expected = IllegalArgumentException.class	)
	public void divisionでゼロ除算を行ったときIllegalArgumentExceptionが送出される() throws Exception {
		// SetUp
		Calculator sut = new Calculator();
		// Verify
		sut.division(3, 0);
	}
	
	@Test
	public void remainderで10を3で除算したときの余りが得られる() throws Exception {
		// SetUp
		Calculator sut = new Calculator();
		// Exercise
		int actual = sut.remainder(10, 3);
		// Verify
		assertThat(actual, is(1));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void remainderでゼロ除算が行ったときIllegalargumentExceptionが送出される() throws Exception {
		// SetUp
		Calculator sut = new Calculator();
		// Verify
		sut.remainder(3, 0);
	}
}
