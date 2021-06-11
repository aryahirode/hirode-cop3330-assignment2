package org.example.ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void fortune() {
        Magic8Ball magic8Ball = new Magic8Ball();
        boolean correct;
        correct = magic8Ball.fortune().equals("Yes.") || magic8Ball.fortune().equals("No.") || magic8Ball.fortune().equals("Maybe.") || magic8Ball.fortune().equals("Ask again later.");
        assertTrue(correct);
    }
}