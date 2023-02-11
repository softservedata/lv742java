package orest.edu11.task2;

public class StringRefactor {
    public static String refactor(String string) {
        return string.replaceAll("\\s{2,}", " ")
                .replaceAll("I am", "I'm").trim();
    }
}
