package piberechnen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiTest {

    @Test
    void calculate() {
        assertEquals(Math.PI, Pi.calculate(), 0.01);
    }
}