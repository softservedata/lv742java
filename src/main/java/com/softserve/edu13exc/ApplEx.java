package com.softserve.edu13exc;

public class ApplEx {

    public static void m1() {
        System.out.println("method m1");
    }

    public static void main(String[] args) {
		/*-
		int i = 0;
		try {
			i = 10 / i;
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("i = " + i);
		*/
		/*-
		int[] arr = new int[5];
		arr[0] = 1;
		System.out.println("arr[10] = " + arr[10]);
		*/
        // /*-
        int k = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("start start start start start start start start start start start start start start start start start start ");
            try {
                Thread.sleep(2);
                //throw new InterruptedException("MY InterruptedException");
            } catch (InterruptedException e) {
                //m1(new RuntimeException(e.getMessage()));
                m1();
                throw new RuntimeException(e.getMessage());
            } finally {
                //m1();
                System.out.println("info");
            }
        }
        if (k == 0) {
            throw new RuntimeException("ha-ha-ha");
        }
        System.out.println("end");
        // */
    }
}
