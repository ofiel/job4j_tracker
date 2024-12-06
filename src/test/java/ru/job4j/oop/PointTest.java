package ru.job4j.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        Assertions.assertThat(distance).isEqualTo(expected, Assertions.withPrecision(0.01));
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