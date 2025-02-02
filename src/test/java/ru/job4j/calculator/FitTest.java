package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92.0;
        double output = Fit.manWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWoman164dot5Then62dot675() {
        float input = 164.5f;
        double expected = 62.675;
        double output = Fit.womanWeight(input);
        assertThat(output).isCloseTo(expected, within(0.01));
    }
}