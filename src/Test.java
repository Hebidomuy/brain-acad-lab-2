import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "ВП2425АА";
        Pattern pattern = Pattern.compile("[А-Я&&[^ЇІЯЮ]&&[^ВР]]{2}[0-9]{4}[А-Я&&[^ЇІЯЮ]]{2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
