import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/23
 * Time: 21:18
 */
public class BookCodeTest {

    String[] bookCodes = {"FPT-001", "FPT-999", "FPT-666", "TAKA-001"};
    Pattern p = Pattern.compile("^TIKI-[0-9]{3}$");

    @Test
    public void test1() {
        for (int i = 0; i < bookCodes.length; i++) {
            Matcher m = p.matcher(bookCodes[i]);
            assertTrue(m.matches());
        }
    }
}
