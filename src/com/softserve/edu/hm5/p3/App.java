package com.softserve.edu.hm5.p3;

import com.softserve.edu.hm5.ArrayUtil;
import com.softserve.edu.hm5.IOArray;

public class App {
    static public void main(String[] arg) {
        int[] num = new int[5];
        IOArray.fillIntArray(num);
        System.out.println("Position of positive number: " + ArrayUtil.positionOfPositiveNumber(num, 2));
        int positionOfMin = ArrayUtil.min(num);
        System.out.println("Position of min number is " + positionOfMin + ", value of min number is " + num[positionOfMin - 1]);
        System.out.println("Product of all even number is " + ArrayUtil.productOfEvenNumber(num));
    }
}
