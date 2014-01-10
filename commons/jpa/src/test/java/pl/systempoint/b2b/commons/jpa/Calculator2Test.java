/**
 * 
 */
package pl.systempoint.b2b.commons.jpa;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import pl.systempoint.b2b.commons.dto.Calculator;

public class Calculator2Test {

	@Test
	public void shouldCalculateFibonacci() {
		Calculator2 calculator2 = new Calculator2();
		int expected2 = 13;
		int actual2 = calculator2.nextFibonacci2(5, 8);

		assertThat(actual2, is(expected2));

		Calculator calculator = new Calculator();
		int expected = 13;
		int actual = calculator.nextFibonacci2(5, 8);

		assertThat(actual, is(expected));
	}
}
