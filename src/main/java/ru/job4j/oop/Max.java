package ru.job4j.oop;

public class Max {
    public Max() {
    }

    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int other) {
        int temp = max(left, right);
        boolean condition = temp > other;
        int result = condition ? temp : other;
        return result;
    }

    public static int max(int left, int right, int other, int another) {
        int temp1 = max(left, right);
        int temp2 = max(other, another);
        boolean condition = temp1 > temp2;
        int result = condition ? temp1 : temp2;
        return result;
    }

    public static void main(String[] args) {
        max(7, 5);
        max(0, 0);
        max(2, 5);
    }
}
