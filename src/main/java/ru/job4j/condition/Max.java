package ru.job4j.condition;

public class Max {

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(
                a,
                max(b, c)
        );
    }

    public int max(int a, int b, int c, int d) {
        return max(
                a,
                max(b, c, d)
        );
    }

    public static void main(String[] args) {
        Max maxFinder = new Max();

        int maxTwo = maxFinder.max(5, 10);
        System.out.println("Максимальное число из двух: " + maxTwo);

        int maxThree = maxFinder.max(5, 10, 15);
        System.out.println("Максимальное число из трех: " + maxThree);

        int maxFour = maxFinder.max(5, 10, 15, 20);
        System.out.println("Максимальное число из четырех: " + maxFour);
    }
}