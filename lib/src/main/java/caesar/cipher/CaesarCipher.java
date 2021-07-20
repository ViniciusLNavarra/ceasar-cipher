package caesar.cipher;

public class CaesarCipher {

	private static final int ALPHABET_SIZE = 26;
	private static final char LOWERCASE_A = 'a';
	private static final char LOWERCASE_Z = 'z';
	private static final char UPPERCASE_A = 'A';
	private static final char UPPERCASE_Z = 'Z';
	
	public String encript(String message, int offset) {
		offset %= ALPHABET_SIZE;
		return shift(message.toCharArray(), offset);
	}

	private String shift(char[] message, int offset) {
		for (int i = 0; i < message.length; i++) {
			message[i] = getChar(message[i], offset);
		}
		return new String(message);
	}

	private char getChar(char c, int offset) {
		if (Character.isLetter(c)) {
			if (Character.isLowerCase(c)){
				c += offset;
				if (c < LOWERCASE_A) {
					c = (char) (c + ALPHABET_SIZE);
				} else if (c > LOWERCASE_Z) {
					c = (char) (c - ALPHABET_SIZE);
				}
			} else {
				c += offset;
				if (c < UPPERCASE_A) {
					c = (char) (c + ALPHABET_SIZE);
				} else if (c > UPPERCASE_Z) {
					c = (char) (c - ALPHABET_SIZE);
				}
			}
		}
		return c;
	}
}
