package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {
    @Test
    void when5Then3() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when11Then5() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2Then1() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when25Then9() {
        int finish = 25;
        int result = PrimeNumber.calc(finish);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when50Then15() {
        int finish = 50;
        int result = PrimeNumber.calc(finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}