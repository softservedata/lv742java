package com.softserve.homework1;

import java.util.Scanner;

public class PhoneCaller {

    private static double totalPrice;
    public static void makeCall() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is country you're calling to: USA, Germany or Poland?");
        String outputCountry = scanner.nextLine();
        System.out.println("Making a call...");
        long startTime = System.currentTimeMillis();
        System.out.println("When you finish your call, type anything below");
        scanner.nextLine();
        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;
        double callPrice = getCallPrice(outputCountry, totalTime);
        double roundedCallPrice = Math.round(callPrice * 100.0) / 100.0;
        totalPrice = totalPrice + callPrice;
        System.out.println("What do you want to do next: get price(type PRICE) or make another call?(type CALL)");
        String answer = scanner.nextLine();
        doNext(answer);
        System.out.println("The call to " + outputCountry + " has took " + totalTime + " second(s)"
                + " and costs " + roundedCallPrice);
    }

    private static void doNext(String answer) {
        if(answer.equalsIgnoreCase("call")) {
            makeCall();
        } else if (answer.equalsIgnoreCase("price")) {
            double roundedTotalPrice = Math.round(totalPrice * 100.0) / 100.0;
            System.out.println("The total price for your calls is........ " + roundedTotalPrice);
        } else {
            throw new IllegalArgumentException("Illegal answer input: "  + answer);
        }
    }


    private static double getCallPrice(String outputCountry, long totalTime) {
        if (outputCountry.equalsIgnoreCase(CountryPrice.USA.toString())
        ) {
            double price = CountryPrice.USA.getPrice();
            return totalTime * price;
        }

        if (outputCountry.equalsIgnoreCase(CountryPrice.POLAND.toString())
        ) {
            double price = CountryPrice.POLAND.getPrice();
            return totalTime * price;
        }

        if (outputCountry.equalsIgnoreCase(CountryPrice.GERMANY.toString())
        ) {
            double price = CountryPrice.GERMANY.getPrice();
            return totalTime * price;
        }
        throw new IllegalArgumentException("Illegal country name: " + outputCountry);
    }


    public static void main(String[] args) {
        PhoneCaller.makeCall();
    }
}
