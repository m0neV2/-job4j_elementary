package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TemperatureFitTest {

    @Test
    void whenRoomTemperature10ThenFruits4() {
        int input = 10;
        double expected = 4.0;
        double output = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenRoomTemperature10ThenMeat0() {
        int input = 10;
        double expected = 0.0;
        double output = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
