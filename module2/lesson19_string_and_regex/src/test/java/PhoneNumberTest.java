import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/23
 * Time: 21:02
 */
public class PhoneNumberTest {
    @Test
    public void test1() {
        String phoneNumber = "0349876595";
        Pattern p = Pattern.compile("^(03|09|08)[0-9]{8}$");
        Matcher m = p.matcher(phoneNumber);
        assertTrue(m.matches());
    }

    @Test
    public void test2() {
        String phoneNumber = "0949876595";
        Pattern p = Pattern.compile("^(03|09|08)[0-9]{8}$");
        Matcher m = p.matcher(phoneNumber);
        assertTrue(m.matches());
    }

    @Test
    public void test3() {
        String phoneNumber = "0809876595"; //
        Pattern p = Pattern.compile("^(03|09|08)[0-9]{8}$");
        Matcher m = p.matcher(phoneNumber);
        assertTrue(m.matches());
    }

    @Test
    public void test4() {
        String phoneNumber = "0409876595"; //
        Pattern p = Pattern.compile("^(03|09|08)[0-9]{8}$");
        Matcher m = p.matcher(phoneNumber);
        assertTrue(m.matches());
    }
}
