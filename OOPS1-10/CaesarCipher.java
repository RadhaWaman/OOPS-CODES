
import java.util.Scanner;

public class CaesarCipher {
    private String alphabet;
    private String shiftedAlphabet;
    private int mainKey;

    // Constructor
    public CaesarCipher(int key) {
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        mainKey = key;
    }

    // Encrypt method
    public String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : input.toUpperCase().toCharArray()) {
            int idx = alphabet.indexOf(c);
            if (idx != -1) {
                encrypted.append(shiftedAlphabet.charAt(idx));
            } else {
                encrypted.append(c); // Leave non-alphabetic characters unchanged
            }
        }

        return encrypted.toString();
    }

    // Decrypt method
    public String decrypt(String input) {
        CaesarCipher cc = new CaesarCipher(26 - mainKey);
        return cc.encrypt(input);
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to encrypt: ");
        String input = scanner.nextLine();

        CaesarCipher cipher = new CaesarCipher(18);
        String encrypted = cipher.encrypt(input);
        System.out.println("Encrypted string: " + encrypted);

        String decrypted = cipher.decrypt(encrypted);
        System.out.println("Decrypted string: " + decrypted);
    }
}
