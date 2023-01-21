package com.softserve.edu.homework05.array;

import com.softserve.edu.homework05.array.models.MinElementModel;
import org.junit.*;
import org.junit.Test;

public class MinElementTest {

    private static MinElementModel minElement;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        minElement = new MinElementModel();
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
    public void minElementPositionTest1(){
        int actual;
        int expected;

        actual = minElement.getMinArrPosition(new int[]{-5, -4, 0, 1, 3, -7, 1, 4});
        expected = 6;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void minElementTest1(){
        int actual;
        int expected;

        actual = minElement.getMinArr(new int[]{-5, -4, 0, 1, 3, -7, 1, 4});
        expected = -7;
        Assert.assertEquals(expected, actual);
    }
}
