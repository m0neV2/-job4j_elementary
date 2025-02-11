package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int numPrime = 0;

        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                numPrime++;
            }
        }
        return numPrime;
    }

    public static void main(String[] args) {
        System.out.println(calc(6));
        System.out.println(calc(3));
        System.out.println(calc(2));
        System.out.println(calc(5));
        System.out.println(calc(10));
    }
}