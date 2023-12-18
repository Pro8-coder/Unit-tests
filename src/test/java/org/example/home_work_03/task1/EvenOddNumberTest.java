//Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
// является ли переданное число четным или нечетным. (код приложен в презентации)
//    if (n % 2 == 0) {
//        return true;
//    } else {
//        return false;
//    }
//}

package org.example.home_work_03.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddNumberTest {

    /**
     * проверяет, возвращает ли метод true для четного числа
     */
    @Test
    public void testEvenNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        boolean result = checker.evenOddNumber(4);
        assertTrue(result);
    }

    /**
     * проверяет, возвращает ли метод false для нечетного числа
     */
    @Test
    public void testOddNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        boolean result = checker.evenOddNumber(3);
        assertFalse(result);
    }

    /**
     * проверяет, возвращает ли метод true для числа 0
     */
    @Test
    public void testZeroIsEven() {
        EvenOddNumber checker = new EvenOddNumber();
        boolean result = checker.evenOddNumber(0);
        assertTrue(result);
    }

    /**
     * проверяет, возвращает ли метод true для отрицательного четного числа
     */
    @Test
    public void testNegativeEvenNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        boolean result = checker.evenOddNumber(-2);
        assertTrue(result);
    }

    /**
     * проверяет, возвращает ли метод false для отрицательного нечетного числа
     */
    @Test
    public void testNegativeOddNumber() {
        EvenOddNumber checker = new EvenOddNumber();
        boolean result = checker.evenOddNumber(-3);
        assertFalse(result);
    }
}
