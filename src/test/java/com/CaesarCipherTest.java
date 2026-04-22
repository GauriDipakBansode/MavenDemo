package com;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CaesarCipherTest {

    @Test
    void testEncryptUppercase() {
        assertEquals("DEF", CaesarCipher.encrypt("ABC", 3));
    }

    @Test
    void testEncryptLowercase() {
        assertEquals("def", CaesarCipher.encrypt("abc", 3));
    }

    @Test
    void testEncryptMixed() {
        assertEquals("DeF", CaesarCipher.encrypt("AbC", 3));
    }

    @Test
    void testWithSpaces() {
        assertEquals("Khoor Zruog", CaesarCipher.encrypt("Hello World", 3));
    }

    @Test
    void testDecrypt() {
        assertEquals("Hello", CaesarCipher.decrypt("Khoor", 3));
    }
}