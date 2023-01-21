package com.softserve.edu.homework05.array;

import com.softserve.edu.homework05.array.models.MonthDaysModel;
import com.softserve.edu.homework05.array.models.SumOrProdModel;
import org.junit.*;
import org.junit.Test;

public class SumOrProdTest {
    private static SumOrProdModel sumOrProd;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        sumOrProd = new SumOrProdModel();
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

    @Test
    public void sumOrProdTest1() {
        int actual;
        int expected;

        actual = sumOrProd.getSumOrProd(new int[]{1, 3, 6, 7, -1, 6}, 3);
        expected = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumOrProdTest2() {
        int actual;
        int expected;
        actual = sumOrProd.getSumOrProd(new int[]{-3, -3, 1, 3, 6, 7, -1, 6}, 5);
        expected = -42;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumOrProdTest3() {
        int actual;
        int expected;
        actual = sumOrProd.getSumOrProd(new int[]{-3, -3, 1, 3, 6, 7, -1, 6}, 10);
        expected = 1;
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void sumTest() {
        int actual;
        int expected;
        actual = sumOrProd.getArraySum(new int[]{-3, -3, 1, 3, 6, 7, -1, 6}, 4, 7);
        expected = 12;
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void prodTest() {
        int actual;
        int expected;
        actual = sumOrProd.getArrayProd(new int[]{-3, -3, 1, 3, 6, 7, -1, 6}, 6, 8);
        expected = -6;
        Assert.assertEquals(expected, actual);
    }


}
