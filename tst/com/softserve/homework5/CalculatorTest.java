package com.softserve.homework5;

import org.junit.*;

public class CalculatorTest {

    private static Calculator calculator = new Calculator();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
//         calculator = new Calculator();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }
//
//    @Before
//    public void setUp() throws Exception {
//        System.out.println("\t@Before setUp()");
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        System.out.println("\t@After tearDown()");
//    }
//
//    @Test(expected = ArithmeticException.class)
//    public void testException() {
//        System.out.println("\t\ttestTestException()");
//        int i = 0;
//        i = 10 / i;
//        System.out.println("\t\t\ti = " + i);
//    }

    @Test
    public void testGetPositiveNumPosition() {
        System.out.println("\t\t@Test testGetPositiveNumPosition()");
        int expected;
        int actual;

        int[] nums = {3, 1, 4, -5, -8, -5};
        actual = calculator.getPositiveNumPosition(nums);
        expected = 2;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetSumOrProduct() {
        System.out.println("\t\t@Test testGetSumOrProduct()");
        int expected;
        int actual;

        int[] nums = {1, 1, 1, 2, 1, 1, 1, 1, 1, 3};
        actual = calculator.getSumOrProduct(nums);
        expected = 6;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getEvenNumsProduct() {
        System.out.println("\t\t@Test testGetEvenNumsProduct()");
        int expected;
        int actual;

        int[] nums = {1, 1, 1, 22, 2, 1, 1, 1, 1, 3};
        actual = calculator.getEvenNumsProduct(nums);
        expected = 44;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMatchMonthDays() {
        System.out.println("\t\t@Test getMatchMonthDays()");
        int expected;
        int actual;

        int input = 4;
        actual = calculator.matchMonthDays(input);
        expected = 30 ;

        Assert.assertEquals(expected, actual);
    }

}
