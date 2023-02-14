package orest.edu12.reader;

import java.util.Scanner;

public class Reader {
    public static void readerService() {
        try (Scanner scanner = new Scanner(System.in)) {
            int start = 0, end = 0;
            boolean inputMismatch = true;
            while (inputMismatch) {
                System.out.println("Enter start number");
                if (scanner.hasNextInt())
                    start = scanner.nextInt();
                else {
                    System.err.println("Please enter valid number");
                    scanner.next();
                    continue;
                }
                System.out.println("Enter end number");
                if (scanner.hasNextInt())
                    end = scanner.nextInt();
                else {
                    System.err.println("Please enter valid number");
                    scanner.next();
                    continue;
                }
                inputMismatch = false;
            }
            int number = readNumber(start, end);
            System.out.printf("You entered %d\n", number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int readNumber(int start, int end) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Enter a number between %d and %d: ", start, end);
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < start || number > end) {
                    throw new IllegalArgumentException("Number is out of range");
                }
                return number;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid input: not a number");
            }
        }
    }
}
