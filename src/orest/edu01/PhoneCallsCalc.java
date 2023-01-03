package orest.edu01;

import java.util.Scanner;

public class PhoneCallsCalc {
    public void phoneCallsLength() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter standard units per minute for the first country.");
            int c1 = scanner.nextInt();

            System.out.println("Enter the minutes for the first call.");
            int t1 = scanner.nextInt();
            System.out.println("Enter the minutes for the second call.");
            int t2 = scanner.nextInt();
            System.out.println("Enter the minutes for the third call.");
            int t3 = scanner.nextInt();

            System.out.println("Cost of minutes for the first country for the first call: " + (c1 * t1)
                    + "\n" +
                    "Cost of minutes for the first country for the second call: " + (c1 * t2)
                    + "\n" +
                    "Cost of minutes for the first country for the third call: " + (c1 * t3));

            System.out.println("Enter standard units per minute for the second country.");
            int c2 = scanner.nextInt();

            System.out.println("Cost of minutes for the second country for the first call: " + (c2 * t1)
                    + "\n" +
                    "Cost of minutes for the second country for the second call: " + (c2 * t2)
                    + "\n" +
                    "Cost of minutes for the second country for the third call: " + (c2 * t3));

            System.out.println("Enter standard units per minute for the third country.");
            int c3 = scanner.nextInt();

            System.out.println("Cost of minutes for the third country for the first call: " + (c3 * t1)
                    + "\n" +
                    "Cost of minutes for the third country for the second call: " + (c3 * t2)
                    + "\n" +
                    "Cost of minutes for the third country for the third call: " + (c3 * t3));

            int totalCosts = ((c1 * t1) + (c1 * t2) + (c1 * t3)) +
                    ((c2 * t1) + (c2 * t2) + (c2 * t3)) +
                    ((c3 * t1) + (c3 * t2) + (c3 * t3));

            System.out.println("Total costs: " + totalCosts);

        }
    }
}
