package ru.job4j.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when000to246then7Dot483() {
        double expected = 7.483;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 4, 6);
        double distance3d = a.distance3d(b);
        Assertions.assertThat(distance3d).isEqualTo(expected, Assertions.withPrecision(0.01));
    }

    @Test
    void when123to321then2Dot828() {
        double expected = 2.828;
        Point a = new Point(1, 2, 3);
        Point b = new Point(3, 2, 1);
        double distance3d = a.distance3d(b);
        Assertions.assertThat(distance3d).isEqualTo(expected, Assertions.withPrecision(0.01));
    }

    @Test
    void whenMinus45to5Minus4then12Dot727() {
        double expected = 12.727;
        Point a = new Point(-4, 5);
        Point b = new Point(5, -4);
        double distance = a.distance(b);
        Assertions.assertThat(distance).isEqualTo(expected, Assertions.withPrecision(0.01));
    }

    @Test
    void when68to1012then5Dot656() {
        double expected = 5.656;
        Point a = new Point(6, 8);
        Point b = new Point(10, 12);
        double distance = a.distance(b);
        Assertions.assertThat(distance).isEqualTo(expected, Assertions.withPrecision(0.01));
    }

    @Test
    void when510to1520then14Dot142() {
        double expected = 14.142;
        Point a = new Point(5, 10);
        Point b = new Point(15, 20);
        double distance = a.distance(b);
        Assertions.assertThat(distance).isEqualTo(expected, Assertions.withPrecision(0.01));
    }
}