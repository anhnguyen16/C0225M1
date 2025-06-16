import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/28
 * Time: 20:32
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void addOne() {
        int expected = 2;
        int actual = calculator.add(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void addThree() {
        int expected = 3;
        int actual = calculator.add(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void subTwo() {
        int expected = 0;
        int actual = calculator.sub(1, 1);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Lấy 10 từ 5 = 5")
    public void subTen() {
        int expected = 5;
        int actual = calculator.sub(10, 5);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Lấy 10 từ 3 = 7")
    public void subEleven() {
        int expected = 7;
        int actual = calculator.sub(10, 3);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Phep chia 5")
    public void div5() {
        int expected = 5;
        int actual = calculator.div(10, 2);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Phep chia 0")
    public void div0() {
        assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
    }
}
