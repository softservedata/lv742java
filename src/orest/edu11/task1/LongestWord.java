package orest.edu11.task1;

import java.util.Arrays;

public class LongestWord {
    public static String longestWord(String[] array) {
        reverseSortArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() != array[i + 1].length())
                return array[i];
        }
        return "";
    }

    public static String secondLongestWord(String[] array) {
        reverseSortArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() != array[i + 1].length())
                return array[i + 1];
        }
        return "";
    }

    private static void reverseSortArray(String[] array) {
        Arrays.sort(array, (a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });
    }
}
