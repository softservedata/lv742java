package com.softserve.edu03oop;

public class App03 {
    private int i; // 0 by default;
    private static int j = 432;

    static {
        System.out.println("\tstatic block start, j = " + j);
        j = 789;
        System.out.println("\tstatic block done, j = " + j);
    }

    // Overload
    public App03() {
        System.out.println("\tconstructor App03() start, i = " + i);
        i = -1;
        System.out.println("\tconstructor App03() done, i = " + i);
    }

    // Overload
    private App03(int i) {
        System.out.println("\tconstructor App03(int i) start, this.i = " + this.i);
        this.i = i;
        System.out.println("\tconstructor App03(int i) done, this.i = " + this.i);
    }

    public void myPrint() {
        System.out.println("i = " + i);
        j = i;
    }

    public static void main(String[] args) {
        System.out.println("main start j = " + j);
        //
        App03 app1 = new App03();
        app1.i = 123;
        //
        App03 app2 = new App03(456);
        //app2.i = 456;
        //
        app1.myPrint();
        System.out.println("\tj = " + j);
        app2.myPrint();
        System.out.println("\tj = " + j);
    }
}
