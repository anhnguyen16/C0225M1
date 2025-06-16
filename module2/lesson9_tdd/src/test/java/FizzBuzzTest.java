import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/28
 * Time: 21:17
 */
public class FizzBuzzTest {
    @Test
    public void fizzTestBy3() {
        String expected = "Fizz";
        String actual = FizzBuzz.translate(3);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzTestBy6() {
        String expected = "Fizz";
        String actual = FizzBuzz.translate(6);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzTestBy9() {
        String expected = "Fizz";
        String actual = FizzBuzz.translate(9);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzBy5() {
        String expected = "Buzz";
        String actual = FizzBuzz.translate(5);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzBy15() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.translate(15);
        assertEquals(expected, actual);
    }
}
