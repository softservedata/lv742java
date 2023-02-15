package com.softserve.edu.hm11.p3;

import com.softserve.edu.hm11.StrUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;

public class App {
    public static void main(String[] args) {
        String text = StrUtil.enterSentence();
        if (text.length() == 0) {
            System.err.println("String is empty!");
            return;
        }

        List<String> list = new ArrayList<>();
        try {
            list = StrUtil.parseCurrency(text);
        }
        catch (PatternSyntaxException e) {
            System.err.println("We have a some problem with regex!");
            return;
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("We have a some problem with substring!");
            return;
        }
        catch (Exception e) {
            System.err.println("We have a unknown problem!");
            return;
        }

        System.out.println(list);
    }
}
