package com.binarynums.binnums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.binarynums.binnums.BinaryNums.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DisplayName("Подсчет последовательности единиц")
public class BinaryNumsTest {

    @Test
    @DisplayName("Если передается null")
    void testCountNumbersNullString() throws Exception {
        assertThat(countNumbers(null)).isEqualTo(0);
    }

    @Test
    @DisplayName("Передается пустая строка")
    void testCountNumbersEmptyString() throws Exception {
        assertThat(countNumbers("")).isEqualTo(0);
    }

    @Test
    @DisplayName("Строка: 00000")
    void testCountNumbersString1() throws Exception {
        assertThat(countNumbers("00000")).isEqualTo(0);
    }

    @Test
    @DisplayName("Строка: 101011")
    void testCountNumbersString2() throws Exception {
        assertThat(countNumbers("101011")).isEqualTo(2);
    }

    @Test
    @DisplayName("Строка: qwerty")
    void testCountNumbersString3() throws Exception {
        assertThat(countNumbers("qwerty")).isEqualTo(0);
    }

    @Test
    @DisplayName("Строка: qw1qw11qwqw111")
    void testCountNumbersString4() throws Exception {
        assertThat(countNumbers("qw1qw11qwqw111")).isEqualTo(3);
    }

    @Test
    @DisplayName("Строка: 123456111111123456")
    void testCountNumbersString5() throws Exception {
        assertThat(countNumbers("123456111111123456")).isEqualTo(7);
    }

    @Test
    @DisplayName("Строка: 000111000111")
    void testCountNumbersString6() throws Exception {
        assertThat(countNumbers("000111000111")).isEqualTo(3);
    }

}
