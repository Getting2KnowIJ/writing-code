package org.effectiveintellij.writing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void shouldHave4Sides() {
        Square square = new Square();
        Assertions.assertEquals(4, square.getSides());
    }
}
