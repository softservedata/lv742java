package orest.edu11.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyFinder {

    public static void usCurrencyFinder(String input) {
        Pattern pattern = Pattern.compile("\\$\\d+(\\.\\d{2})?");
        Matcher matcher = pattern.matcher(input);

        System.out.println("US currency occurrences: ");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
