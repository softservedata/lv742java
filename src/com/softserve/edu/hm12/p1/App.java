package com.softserve.edu.hm12.p1;

import com.softserve.edu.hm12.Util;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        try {
            list = Util.inputDoubleNumber(2);
            System.out.printf("Result of dividing %f and %f is: %f", list.get(0), list.get(1), Util.div(list.get(0), list.get(1)));
        } catch (IllegalStateException e) {
            //e.printStackTrace();
            System.err.println("IllegalStateException. Can`t close stream!\t" + e.getMessage());
        } catch (Exception e) {
            //e.printStackTrace();
            System.err.println("We have a big unknown problem!\t" + e.getMessage());
        } catch (Throwable e) {
            //e.printStackTrace();
            System.err.println("We have the biggest unknown problem!\t" + e.getMessage());
        }
    }
}
