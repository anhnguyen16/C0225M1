import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/23
 * Time: 21:08
 */
public class EmailTest {
    Pattern p = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9]*@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$");

    @Test
    public void test0() {
        String email = "WANBI95@GMAIL.COM";
        Matcher m = p.matcher(email);
        assertTrue(m.matches());
    }

    @Test
    public void test1() {
        String email = "w@gmail.com";
        Matcher m = p.matcher(email);
        assertTrue(m.matches());
    }

    @Test
    public void test2() {
        String wrongEmail = "wanbi@gmail";
        Matcher m = p.matcher(wrongEmail);
        assertTrue(m.matches());
    }

    @Test
    public void test3() {
        String wrongEmail = "wanbigmail.com";
        Matcher m = p.matcher(wrongEmail);
        assertTrue(m.matches());
    }
}
