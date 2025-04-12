import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calcTEST {
    Calculator calc = new Calculator();

    @Test
    void testadd(){
        assertEquals(10,calc.add(7,2));
    }
    @Test
    void testsub(){
        assertEquals(2,calc.subtract(2,4));
    }
    @Test
    void testSubtractionNegativeThrowsException() {
        assertThrows(IllegalStateException.class, () -> calculator.subtract(3, 5));
    }
    @Test
    void testmul(){
        assertEquals(20,calc.multiply(2,10));
    }
    @Test
    void testMultiplicationOverflowThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> calculator.multiply(Integer.MAX_VALUE, 2));
    }
    @Test
    void testdiv(){
        assertEquals(5,calc.divide(10,2));
    }
    @Test
    void testDivisionByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
