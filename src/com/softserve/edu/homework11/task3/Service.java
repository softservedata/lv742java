package com.softserve.edu.homework11.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {

    public boolean verifyRegex(String s){

        String pattern = "^[$]([0-9]+)\\.[0-9]{2}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
