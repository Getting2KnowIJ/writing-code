package com.getting2knowij.writing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void shouldHave4Sides() {
        Square square = new Square("label");
        Assertions.assertEquals(4, square.getSides());
    }
}
