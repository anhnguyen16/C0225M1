/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/28
 * Time: 21:21
 */
public class FizzBuzz {
    public static String translate(int number) {
        boolean isFizz = number % 3 == 0;
        boolean izBuzz = number % 5 == 0;
        if (isFizz && izBuzz) { 
            return "FizzBuzz";
        } else if (isFizz) {
            return "Fizz";
        } else if (izBuzz) {
            return "Buzz";
        }
        return "";
    }
}
