package com.softserve.edu05;

import org.junit.*;

public class TestCalc {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before setUp()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown()");
    }

    @Test()
    public void testForTask1() {
        System.out.println("\t\t@TesttestForTask1()");
        int expected = 31;
        int input = 5;
        int actual = Calculator.months(input);

        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testForTask2() {
        System.out.println("\t\t@TesttestForTask2()");
        int[] numbers = new int[]{10, 3, -1, 5, 6, 2, -1, 1, 9, 1};
        int actual = Calculator.countSumOrProd(numbers);
        int expected = -18;

        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testForTask3Part1() {
        System.out.println("\t\t@TesttestForTask3() Find position of second positive number");
        int[] numbers = new int[]{10, 3, -1, 5, 8};
        int actual = Calculator.positionOfSecondPosNum(numbers);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testForTask3Part2() {
        System.out.println("\t\t@TesttestForTask3() Find minimal element and position");
        int[] numbers = new int[]{10, 3, -1, 5, 8};
        int actual = Calculator.minEll(numbers);
        int expected = -1;

        Assert.assertEquals(expected, actual);

        actual = Calculator.positionMinEll(numbers);
        expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testForTask3Part3() {
        System.out.println("\t\t@TesttestForTask3() Find prod of all even numbers");
        int[] numbers = new int[]{10, 3, -1, 5, 8};
        int actual = Calculator.prodOfEvenNums(numbers);
        int expected = 80;

        Assert.assertEquals(expected, actual);
    }
}
