package Baitap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsCrawler {
    public static void main(String[] args) {
        String url = "http://dantri.com.vn/the-gioi.htm";
        try {
            URL dantriUrl = new URL(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(dantriUrl.openStream()));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();

            // Regular expression to match news titles
            String regex = "<h3 class=\"news-item__title\"><a href=\".*?\">(.*?)</a></h3>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(content.toString());

            // Display news titles
            System.out.println("News titles from " + url + ":");
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
