package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
     void sum() {
        int start = 10;
        int finish = 5;
        for (int i = start; i <= finish; i++) {
            System.out.println(i);
        }
    }
}