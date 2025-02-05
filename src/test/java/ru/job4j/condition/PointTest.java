package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints5And5And8Minus8Then2() {
        int x1 = 5, y1 = -5, x2 = 8, y2 = -8;
        double expected = 4.24;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus5Minus7And9And12Then2Dot83() {
        int x1 = -5, y1 = -7, x2 = 9, y2 = 12;
        double expected = 23.6;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints4And6And8AndMinus4Then5Dot66() {
        int x1 = -4, y1 = 6, x2 = 8, y2 = -4;
        double expected = 15.62;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}