// Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки
// и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
// Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
// Не забудьте написать тесты для проверки этого поведения.

package org.example.home_work_01;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testCalculateDiscountWithValidArguments() {
        double purchaseAmount = 100.0;
        double discountPercentage = 10.0;
        double expectedDiscountedAmount = 90.0;
        
        double result = calculator.calculateDiscount(purchaseAmount, discountPercentage);
        
        assertThat(result).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    public void testCalculateDiscountWithInvalidArguments() {
        assertThatThrownBy(() -> calculator.calculateDiscount(-100.0, 10.0))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Invalid input: purchase amount and discount percentage must be non-negative, and discount percentage must be between 0 and 100.");

        assertThatThrownBy(() -> calculator.calculateDiscount(100.0, -10.0))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Invalid input: purchase amount and discount percentage must be non-negative, and discount percentage must be between 0 and 100.");

        assertThatThrownBy(() -> calculator.calculateDiscount(100.0, 110.0))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Invalid input: purchase amount and discount percentage must be non-negative, and discount percentage must be between 0 and 100.");
    }
}
