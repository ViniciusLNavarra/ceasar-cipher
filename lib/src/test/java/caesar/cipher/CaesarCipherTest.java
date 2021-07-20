package caesar.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {
	
	CaesarCipher cipher = new CaesarCipher();
	
	@Test
	void testWithPositiveOffsetOfSeven() {
		assertEquals("JP/JK ohz illu slhyulk", cipher.encript("CI/CD has been learned", 7));
	}
	
	@Test
	void testWithNegativeOffsetOfSeven() {
		assertEquals("VB/VW atl uxxg extkgxw", cipher.encript("CI/CD has been learned", -7));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", cipher.encript("", 7));
	}
}
