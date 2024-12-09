package ru.job4j.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxTest {

    @Test
    void whenLeft7Right5Max7() {
        int left = 7;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 7;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft0Right0Other0Max0() {
        int left = 0;
        int right = 0;
        int other = 0;
        int result = Max.max(left, right, other);
        int expected = 0;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft2Right5Other8Another10Max5() {
        int left = 2;
        int right = 5;
        int other = 8;
        int another = 10;
        int result = Max.max(left, right, another);
        int expected = 10;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}