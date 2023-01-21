package com.softserve.edu.homework05.array;

import com.softserve.edu.homework05.array.models.MonthDaysModel;
import com.softserve.edu.homework05.array.models.PositionPositiveModel;
import org.junit.*;
import org.junit.Test;

public class MonthDaysTest {
    private static MonthDaysModel monthDays;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        monthDays = new MonthDaysModel();
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

    @org.junit.Test
    public void monthDaysTest1() {
        int actual;
        int expected;

        actual = monthDays.getMonthDays(7);
        expected = 31;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void monthDaysTest2() {
        int actual;
        int expected;
        actual = monthDays.getMonthDays(2);
        expected = 31;
        Assert.assertNotEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void positionPositiveNumbTest3() {
        int actual;
        actual = monthDays.getMonthDays(14);
        System.out.println(actual);

    }
}
