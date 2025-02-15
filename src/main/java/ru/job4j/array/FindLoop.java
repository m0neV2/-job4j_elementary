package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 6};
        System.out.println(indexOf(array, 2));
    }
}