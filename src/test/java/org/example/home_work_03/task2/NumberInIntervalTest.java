//Разработайте и протестируйте метод numberInInterval, который проверяет,
// попадает ли переданное число в интервал (25;100). (код приложен в презентации)
//public boolean evenOddNumber(int n) {
//public boolean numberInInterval(int n) { … }

package org.example.home_work_03.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberInIntervalTest {

    /**
     * Проверяет, возвращает ли метод true, если число попадает в интервал (25; 100).
     */
    @Test
    public void testNumberInIntervalWithinRange() {
        NumberInInterval checker = new NumberInInterval();
        boolean result = checker.numberInInterval(50);
        assertTrue(result);
    }

    /**
     * Проверяет, возвращает ли метод false, если число меньше интервала (24).
     */
    @Test
    public void testNumberInIntervalBelowRange() {
        NumberInInterval checker = new NumberInInterval();
        boolean result = checker.numberInInterval(24);
        assertFalse(result);
    }

    /**
     * Проверяет, возвращает ли метод false, если число больше интервала (101).
     */
    @Test
    public void testNumberInIntervalAboveRange() {
        NumberInInterval checker = new NumberInInterval();
        boolean result = checker.numberInInterval(101);
        assertFalse(result);
    }
}
