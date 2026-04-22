package com;

public class CaesarCipher {

    // Encrypt method
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                char encrypted = (char) ((ch - 'A' + shift) % 26 + 'A');
                result.append(encrypted);

            } else if (Character.isLowerCase(ch)) {
                char encrypted = (char) ((ch - 'a' + shift) % 26 + 'a');
                result.append(encrypted);

            } else {
                // keep numbers and symbols unchanged
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Decrypt method
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}