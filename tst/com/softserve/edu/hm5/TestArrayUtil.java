package com.softserve.edu.hm5;

import org.junit.*;

public class TestArrayUtil {
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

    @Test//(expected = ArithmeticException.class)
    public void testProductOfEvenNumber() {
        System.out.println("\t\t@TestGetMonthByNumber");

        int[] currentArray = {2, 3, 7, -15, -25, 4, -10, 100};

        int expected = -8000;
        int actual = ArrayUtil.productOfEvenNumber(currentArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstElementArePositive() {
        System.out.println("\t\t@TestFirstElementArePositive");

        int[] currentArray = {-18, -22, 2, 3, 7, -15, -25, 4, -10, 100};

        boolean expected = false;
        boolean actual = ArrayUtil.firstElementArePositive(currentArray, 5);

        Assert.assertEquals(expected, actual);
    }
}
