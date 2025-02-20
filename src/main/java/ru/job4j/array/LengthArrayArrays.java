package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
        System.out.println();
        int[][] numbers2 = {{1}, {2, 4}, {1, 5, 3}, {3, 2, 1, 4}};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Размер вложенного массива равен: " + numbers2[i].length);
        }
    }
}