package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints5AndMinus5And8AndMinus8Then4Dot24() {
        Point point1 = new Point(5, -5);
        Point point2 = new Point(8, -8);
        double expected = 4.24;
        double result = point1.distance(point2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus5AndMinus7And9And12Then23Dot6() {
        Point point1 = new Point(-5, -7);
        Point point2 = new Point(9, 12);
        double expected = 23.6;
        double result = point1.distance(point2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus4And6And8AndMinus4Then15Dot62() {
        Point point1 = new Point(-4, 6);
        Point point2 = new Point(8, -4);
        double expected = 15.62;
        double result = point1.distance(point2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}