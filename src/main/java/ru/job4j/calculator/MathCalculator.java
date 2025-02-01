package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second){
        return sum(first, second) + multiple(first, second);
    }
    public static double minusAndDelenie(double first, double second){
        return minus(first, second) + delenie(first, second);
    }
    public static double all(double first, double second){
        return sum(first, second) + multiple(first, second) + minus(first, second) + delenie(first, second);
    }
    public static void main(String[] args){
        System.out.println("Результат рассчета равен: " + sumAndMultiply(11, 20));
        System.out.println("Результат рассчета равен: " + minusAndDelenie(11, 20));
        System.out.println("Результат рассчета равен: " + all(11, 20));
    }

}
