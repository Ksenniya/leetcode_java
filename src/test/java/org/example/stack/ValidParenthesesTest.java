package org.example.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertTrue(validParentheses.isValid("{[]}"));
        Assertions.assertFalse(validParentheses.isValid("{[}"));

    }

    @Test
    void isValid2() {
        ValidParentheses2 validParentheses = new ValidParentheses2();
        Assertions.assertTrue(validParentheses.isValid("{[]}"));
        Assertions.assertFalse(validParentheses.isValid("{[}"));

    }
}