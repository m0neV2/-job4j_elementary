package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] prices = new float[40];
        System.out.println(prices.length);
        String[] names = new String[4];
        names[0] = "Sadih Salahov";
        names[1] = "Petr Arsentev";
        names[2] = "Korobenikov Stas";
        names[3] = "Anton Gorlov";
        System.out.println("Элементы массива: " + names[0] + ", " + names[1] + ", " + names[2] + ", " + names[3]);
    }
}