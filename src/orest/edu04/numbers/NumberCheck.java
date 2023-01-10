package orest.edu04.numbers;

import java.util.Scanner;

public class NumberCheck {

    public void floatNumbersCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the first float number: ");
        float a = scanner.nextFloat();
        System.out.print("Write the second float number: ");
        float b = scanner.nextFloat();
        System.out.print("Write the third float number: ");
        float c = scanner.nextFloat();

        boolean result = (a > -5 && a < 5) && (b > -5 && b < 5) && (c > -5 && c < 5);

        if (result) {
            System.out.println("All float numbers are belong to the range between -5 to 5");
        } else {
            boolean first = false;
            boolean second = false;
            boolean third = false;

            if (!(a > -5 && a < 5)) {
                first = true;
                System.out.println("First number is not belong to the range between -5 to 5." +
                        "\na= " + a);
            }

            if (!(b > -5 && b < 5)) {
                second = true;
                System.out.println("Second number is not belong to the range between -5 to 5." +
                        "\nb= " + b);
            }

            if (!(c > -5 && c < 5)) {
                third = true;
                System.out.println("Third number is not belong to the range between -5 to 5." +
                        "\nc= " + c);
            }

            if ((first && second && third)) {
                System.out.println("All float numbers are not belong to the range between -5 to 5");
            }
        }
    }

    public void minMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the first number: ");
        int a = scanner.nextInt();
        System.out.print("Write the second number: ");
        int b = scanner.nextInt();
        System.out.print("Write the third number: ");
        int c = scanner.nextInt();

        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("The smallest number is: " + min);

        int max;

        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("The biggest number is: " + max);
    }

    public void httpStatusCodeCheck(){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the HTTP Error status code: ");
            int code = scanner.nextInt();

            switch (code){
                case 400:
                    System.out.println(HTTPError.BAD_REQUEST);
                    break;
                case 401:
                    System.out.println(HTTPError.UNAUTHORIZED);
                    break;
                case 402:
                    System.out.println(HTTPError.PAYMENT_REQUIRED);
                    break;
                case 403:
                    System.out.println(HTTPError.FORBIDDEN);
                    break;
                case 404:
                    System.out.println(HTTPError.NOT_FOUND);
                    break;
                default:
                    System.out.println("HTTP Error status code wasn't found.");
            }
        }
    }
}
