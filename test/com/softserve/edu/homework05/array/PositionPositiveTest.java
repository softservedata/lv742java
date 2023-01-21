package com.softserve.edu.homework05.array;

import com.softserve.edu.homework05.array.models.PositionPositiveModel;
import org.junit.*;
import org.junit.Test;

public class PositionPositiveTest {
    private static PositionPositiveModel indexPositive;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        indexPositive = new PositionPositiveModel();
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
    public void positionPositiveNumbTest1(){
        int actual;
        int expected;

        actual = indexPositive.getPositionPositiveNumb(new int[]{-5, -4, 0, 1, 3, -7, 1, 4}, 3);
        expected = 7;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void positionPositiveNumbTest2(){
        int actual;
        int expected;
        actual = indexPositive.getPositionPositiveNumb(new int[]{6, 8, 0, 1, 3, -7, 1, 4}, 8);
        expected = 0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void positionPositiveNumbTest3(){
        int actual;
        int expected;
        actual = indexPositive.getPositionPositiveNumb(new int[]{6, 8, 0, 1, 3, -7, 1, 4}, -3);
        expected = 0;
        Assert.assertEquals(expected, actual);
    }

}
