package vn.codegym;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/23
 * Time: 21:23
 */
public class DanTriCrawler {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
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
            Pattern p = Pattern.compile("dt-text-black-mine\" href=\"(.*?)\">(.*?)</a>");
            Matcher m = p.matcher(content);
            ArrayList<String> urls = new ArrayList<>();
            while (m.find()) {
                urls.add(m.group(1));
            }

            System.out.println("SIZE------------" + urls.size());
            for(String u : urls) {
                URL url2 = new URL(u);
                URLConnection connection2 = url2.openConnection();
                connection2.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                connection2.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
                connection2.setRequestProperty("Referer", "https://www.nhaccuatui.com/");
                connection2.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
                // open the stream and put it into BufferedReader
                Scanner scanner2 = new Scanner(new InputStreamReader(connection2.getInputStream()));
                scanner2.useDelimiter("\\Z");
                String content2 = scanner2.next();
                // close scanner
                // remove all new line
//                System.out.println(content2);
                content2 = content2.replaceAll("\\n+", "");
                // regex
                Pattern p2 = Pattern.compile("<div class=\"author-name\"><a href=\"[^\"]+\"><b>(.*?)</b></a></div>");
                Matcher m2 = p2.matcher(content2);
                while (m2.find()) {
                    System.out.println(u + ":" + m2.group(1));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}