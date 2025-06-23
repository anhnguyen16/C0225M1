package vn.codegym;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/23
 * Time: 21:23
 */
public class NCTCrawler {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            connection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            connection.setRequestProperty("Referer", "https://www.nhaccuatui.com/");
            connection.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(connection.getInputStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }

            // Pattern for author name
            Pattern p2 = Pattern.compile("<div class=\"author-name\"><a href=\"[^\"]+\"><b>(.*?)</b></a></div>");
            Matcher m2 = p2.matcher(content);
            while (m2.find()) {
                System.out.println("Author: " + m2.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}