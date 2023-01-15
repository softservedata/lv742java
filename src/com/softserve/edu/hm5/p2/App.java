package com.softserve.edu.hm5.p2;

import com.softserve.edu.hm5.ArrayUtil;
import com.softserve.edu.hm5.IOArray;

public class App {
    static public void main(String[] arg) {
        int[] num = new int[10];
        IOArray.fillIntArray(num);
        if (ArrayUtil.firstElementArePositive(num, 5)) System.out.println("The add first 5 element is " + ArrayUtil.addFirstNumberOfIntArray(num, 5));
        else {
            System.out.println("The product last 5 element is " + ArrayUtil.productLastNumberOfIntArray(num, 5));
        }
    }
}
