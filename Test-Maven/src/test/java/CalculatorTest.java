import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testPlus_validArgument_success() {
        // given:
        Calculator calc = Calculator.instance.get();

        // when:
        int result = calc.plus.apply(1, 2);

        // then:
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testMinus_validArgument_success() {
        // given:
        Calculator calc = Calculator.instance.get();

        // when:
        int result = calc.minus.apply(5, 2);

        // then:
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testDivide_validArgument_success() {
        // given:
        Calculator calc = Calculator.instance.get();

        // when:
        int result = calc.devide.apply(6, 2);

        // then:
        Assertions.assertEquals(3, result);
    }
}