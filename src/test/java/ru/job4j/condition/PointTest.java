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

    @Test
    void whenPoints0And0And0And0And4And6Then7Dot21() {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(0, 4, 6);
        double expected = 7.21;
        double result = point1.distance3d(point2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints1And2And3And4And5And6Then5Dot2() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 5, 6);
        double expected = 5.2;
        double result = point1.distance3d(point2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1AndMinus2AndMinus3And1And2And3Then6Dot93() {
        Point point1 = new Point(-1, -2, -3);
        Point point2 = new Point(1, 2, 3);
        double expected = 7.48;
        double result = point1.distance3d(point2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}