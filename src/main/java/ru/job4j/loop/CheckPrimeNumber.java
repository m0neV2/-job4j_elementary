package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

        public static void main(String[] args) {
            System.out.println(check(6));
            System.out.println(check(3));
            System.out.println(check(5));
        }
    }