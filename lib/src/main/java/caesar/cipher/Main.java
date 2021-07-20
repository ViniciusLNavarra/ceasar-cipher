package caesar.cipher;

public class Main {

	public static void main(String[] args) {
		CaesarCipher cipher = new CaesarCipher();
		String message = "CI/CD has been learned";
		int offset = 7;
		String encriptedMessage = cipher.encript(message, offset);
		System.out.println("Message: " + message + "\n" +
						 "Offset: " + offset + "\n" +
						 "Encrypted: " + encriptedMessage);
		int offset2 = -7;
		String encriptedMessage2 = cipher.encript(message, offset2);
		System.out.println("Message: " + message + "\n" +
						 "Offset: " + offset2 + "\n" +
						 "Encrypted: " + encriptedMessage2);
	}

}
