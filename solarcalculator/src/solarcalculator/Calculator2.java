import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        assertEquals(5, Calculator.sum(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, Calculator.subtract(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(6, 0);
    }
}
