package com.softserve.edu.hm5.p1;

import org.junit.*;

public class MonthTest {
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
    public void testGetMonthByNumber() {
        System.out.println("\t\t@TestGetMonthByNumber");

        Months expected = Months.getMonthByNumber(8);
        Months actual = Months.AUGUST;

        Assert.assertEquals(expected, actual);
    }
}
