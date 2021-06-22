package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.JunitTesting;

class countTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.count("Amanda");
		assertEquals(3, output);
	}

}
