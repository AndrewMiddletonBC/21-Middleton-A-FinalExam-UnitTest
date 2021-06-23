import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	void negativeNumberThrowsTest() {
		assertThrows(Exception.class, () -> StringCalculator.add("-1,5"));
	}
	
	@Test
	void numberOverThousandIgnored() {
		assertEquals(1, StringCalculator.add("1,1000"));
	}
}
