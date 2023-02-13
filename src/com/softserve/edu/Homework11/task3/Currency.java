package com.softserve.edu.Homework11.task3;

public class Currency {

        private String text;

        public Currency(String text) {
            this.text = text;
        }

        public void findCurrency() {
            String[] parts = text.split("\\$");

            System.out.print("\nCurrency occurrences: ");
            for (String part : parts) {
                if (part.matches("\\d+(\\.\\d{2})?"))

                    System.out.println("$" + part);
                }
            }
}



