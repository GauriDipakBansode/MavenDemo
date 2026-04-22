package com;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    void testadd() {
        assertEquals(3, Add.add(1, 2));
    }


}