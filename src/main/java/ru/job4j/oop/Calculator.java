package ru.job4j.oop;

public class Calculator {
    static private int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divade (int y) {
        return y/x;
    }
    public int sumAllOperation(int y) {
        return y = sum(y) + minus(y) + divade(y);
    }

    public static void main(String[] args) {
        int sumResult = Calculator.sum(10);
        System.out.println("Сумма = " + sumResult);
        int minusResult = Calculator.minus(10);
        System.out.println("Разность = " + minusResult);
        Calculator divadeResult = new Calculator();
        System.out.println("Деление = " + divadeResult.divade(10));
        Calculator sumAllOperationResult = new Calculator();
        System.out.println("Сумма всего = " + sumAllOperationResult.sumAllOperation(10));

    }
}
