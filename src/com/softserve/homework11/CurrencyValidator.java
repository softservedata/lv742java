package com.softserve.homework11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyValidator {

    public static void main(String[] args) {
        CurrencyValidator validator = new CurrencyValidator();
        String str1 = "$123458.54";
        String str2 = "$.54";
        String str3 = "$0.54";
        String str4 = "$123458.545";
        String str5 = "$1234556464645645658.54";
        String str6 = "$12345854";
        String str7 = "0";
        String str8 = "$0";
        String str9 = "4432234.55$";
        System.out.println(validator.isValidUSDCurrencyFormat(str1));
        System.out.println(validator.isValidUSDCurrencyFormat(str2));
        System.out.println(validator.isValidUSDCurrencyFormat(str3));
        System.out.println(validator.isValidUSDCurrencyFormat(str4));
        System.out.println(validator.isValidUSDCurrencyFormat(str5));
        System.out.println(validator.isValidUSDCurrencyFormat(str6));
        System.out.println(validator.isValidUSDCurrencyFormat(str7));
        System.out.println(validator.isValidUSDCurrencyFormat(str8));
        System.out.println(validator.isValidUSDCurrencyFormat(str9));
    }

    public boolean isValidUSDCurrencyFormat(String string) {

        String regex = "^\\$([1-9]+)(\\.\\d{2})";
        Pattern p = Pattern.compile(regex);
        if (string == null) {
            return false;
        }
        Matcher m = p.matcher(string);
        return m.matches();
    }


}
