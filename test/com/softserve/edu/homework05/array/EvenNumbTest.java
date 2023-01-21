package com.softserve.edu.homework05.array;

import com.softserve.edu.homework05.array.models.EvenNumbModel;
import org.junit.*;
import org.junit.Test;

public class EvenNumbTest {
    private static EvenNumbModel evenNumb;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        evenNumb = new EvenNumbModel();
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
    public void evenNumbTest1(){
        System.out.println("@Test1 even number product");
        int actual;
        int expected;

        actual = evenNumb.getProdEvenNumb(new int[]{1, 3, 2, 5, 6, 2, 7, 4});
        expected = 96;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void evenNumbTest2(){
        System.out.println("@Test2 even number product");
        int actual;
        int expected;

        actual = evenNumb.getProdEvenNumb(new int[]{0, -3, -2, 0, 16, 2, 7, 4});
        expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void evenNumbTest3(){
        System.out.println("@Test3 even number product");
        int actual;
        int expected;

        actual = evenNumb.getProdEvenNumb(new int[]{1, -3, -2, 3, 16, 1, 7, 4});
        expected = -128;
        Assert.assertEquals(actual, expected);
    }

}
