package com.softserve.HomeWork_05Tests;

import com.softserve.HomeWork_05.Task_03;
import org.junit.*;

public class Task_03Tests {
    private static Task_03 task_03;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        task_03 = new Task_03();
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
    public void testAdd1() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {1, 2, 3, 4, 5};
        task_03.setNumbers(numbers);
        String actual = task_03.output();
        String expected = "The position of second positive number = 1.\n" +
                "The minimum = 1 and its position = 0.\n" +
                "The product of all entered even numbers = 8.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd2() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {0, 0, 0, 0, 0};
        task_03.setNumbers(numbers);
        String actual = task_03.output();
        String expected = "There are less than two positive numbers in the array.\n" +
                "The minimum = 0 and its position = 0.\n" +
                "The product of all entered even numbers = 0.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd3() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {1, 0, 0, 0, 0};
        task_03.setNumbers(numbers);
        String actual = task_03.output();
        String expected = "There are less than two positive numbers in the array.\n" +
                "The minimum = 0 and its position = 1.\n" +
                "The product of all entered even numbers = 0.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd4() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {-1, -2, -3, -4, -5};
        task_03.setNumbers(numbers);
        String actual = task_03.output();
        String expected = "There are less than two positive numbers in the array.\n" +
                "The minimum = -5 and its position = 4.\n" +
                "The product of all entered even numbers = 8.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd5() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {1, 1, 1, 1, 1};
        task_03.setNumbers(numbers);
        String actual = task_03.output();
        String expected = "The position of second positive number = 1.\n" +
                "The minimum = 1 and its position = 0.\n" +
                "There are no even numbers in the array.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd6() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {2, 4, 6, 8, 10};
        task_03.setNumbers(numbers);
        String actual = task_03.output();
        String expected = "The position of second positive number = 1.\n" +
                "The minimum = 2 and its position = 0.\n" +
                "The product of all entered even numbers = 3840.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd7() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {11, 9, 7, 5, 3};
        task_03.setNumbers(numbers);
        String actual = task_03.output();
        String expected = "The position of second positive number = 1.\n" +
                "The minimum = 3 and its position = 4.\n" +
                "There are no even numbers in the array.";
        //
        Assert.assertEquals(expected, actual);
    }
}
