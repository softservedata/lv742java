package com.softserve.HomeWork_05Tests;


import com.softserve.HomeWork_05.Task_02;
import org.junit.*;

public class Task_02Tests {
    private static Task_02 task_02;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        task_02 = new Task_02();
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
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int actual = task_02.result(numbers);
        int expected = 15;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd2() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int actual = task_02.result(numbers);
        int expected = 5;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd3() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {-1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int actual = task_02.result(numbers);
        int expected = 30240;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd4() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {-1, 2, 3, 4, 5, 6, 0, 8, 9, 10};
        int actual = task_02.result(numbers);
        int expected = 0;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd5() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {0, 2, 3, 4, 5, 1, -1, -1, -1, -1};
        int actual = task_02.result(numbers);
        int expected = 1;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd7() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {10, 20, 300, 4000, 50000, 0, 0, 0, -11, 0};
        int actual = task_02.result(numbers);
        int expected = 54330;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd8() {
        System.out.println("\t\t@TesttestException()");
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int actual = task_02.result(numbers);
        int expected = 0;
        //
        Assert.assertEquals(expected, actual);
    }
}