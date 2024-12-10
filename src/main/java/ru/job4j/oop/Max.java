package ru.job4j.oop;

public class Max {
    public Max() {
    }

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int other) {
        int result = max(max(left, right), other);
        return result;

    }

    public static int max(int left, int right, int other, int another) {
        int result = max(max(left, right), max(other, another));
        return result;
    }

    public static void main(String[] args) {
        max(7, 5);
        max(0, 0);
        max(2, 5);
    }
}
