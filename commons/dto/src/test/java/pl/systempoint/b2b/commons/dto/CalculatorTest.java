/**
 * 
 */
package pl.systempoint.b2b.commons.dto;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void shouldCalculateFibonacci() {
		Calculator calculator = new Calculator();
		int expected = 13;
		int actual = calculator.nextFibonacci(5, 8);

		assertThat(actual, is(expected));
	}
}
