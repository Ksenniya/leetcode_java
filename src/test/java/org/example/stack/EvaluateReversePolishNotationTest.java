package org.example.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void evalRPN() {
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        Assertions.assertEquals(9, evaluateReversePolishNotation.evalRPN(new String[]{"2","1","+","3","*"}));
    }
}