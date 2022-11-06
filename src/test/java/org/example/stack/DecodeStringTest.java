package org.example.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    @Test
    void decodeString() {
        DecodeString ds = new DecodeString();
        Assertions.assertEquals("accaccacc", ds.decodeString("12[a11[c]]"));
    }
}