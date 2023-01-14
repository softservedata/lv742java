package com.softserve.HomeWork_05Tests;

import com.softserve.HomeWork_05.Task_01;
import org.junit.*;

public class Task_01Tests {
    private static Task_01 task_01;

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
    public void testAdd1() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(1);
        int actual = task_01.daysAmount();
        int expected = 31;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd2() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(2);
        int actual = task_01.daysAmount();
        int expected = 28;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd3() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(3);
        int actual = task_01.daysAmount();
        int expected = 31;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd4() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(4);
        int actual = task_01.daysAmount();
        int expected = 30;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd5() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(5);
        int actual = task_01.daysAmount();
        int expected = 31;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd6() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(6);
        int actual = task_01.daysAmount();
        int expected = 30;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd7() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(7);
        int actual = task_01.daysAmount();
        int expected = 31;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd8() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(8);
        int actual = task_01.daysAmount();
        int expected = 31;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd9() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(9);
        int actual = task_01.daysAmount();
        int expected = 30;
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd10() {
        System.out.println("\t\t@TesttestException()");
        task_01 = new Task_01(12);
        int actual = task_01.daysAmount();
        int expected = 31;
        //
        Assert.assertEquals(expected, actual);
    }
}

