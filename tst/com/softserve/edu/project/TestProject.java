package com.softserve.edu.project;

import com.softserve.edu.hm5.ArrayUtil;
import org.junit.*;

import java.util.List;

public class TestProject {
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

    @Test
    public void testFirstExample() {
        System.out.println("\t\t@testFirstExample");

        List<String> inList = FileUtil.readTextFileToList("./project/test1_in.txt");
        if (inList.size() == 0) {
            System.out.println("File test1_in is empty");
            return;
        }
        List<String> expected = FileUtil.readTextFileToList("./project/test1_out.txt");
        if (inList.size() == 0) {
            System.out.println("File test1_out is empty");
            return;
        }
        OrderBook orderBook = new OrderBook();
        orderBook.parseFromList(inList);

        List<String> actual = orderBook.parseToList();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSecondExample() {
        System.out.println("\t\t@testSecondExample");

        List<String> inList = FileUtil.readTextFileToList("./project/test2_in.txt");
        if (inList.size() == 0) {
            System.out.println("File test2_in is empty");
            return;
        }
        List<String> expected = FileUtil.readTextFileToList("./project/test2_out.txt");
        if (inList.size() == 0) {
            System.out.println("File test2_out is empty");
            return;
        }
        OrderBook orderBook = new OrderBook();
        orderBook.parseFromList(inList);

        List<String> actual = orderBook.parseToList();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThirdExample() {
        System.out.println("\t\t@testThirdExample");

        List<String> inList = FileUtil.readTextFileToList("./project/test3_in.txt");
        if (inList.size() == 0) {
            System.out.println("File test3_in is empty");
            return;
        }
        List<String> expected = FileUtil.readTextFileToList("./project/test3_out.txt");
        if (inList.size() == 0) {
            System.out.println("File test3_out is empty");
            return;
        }
        OrderBook orderBook = new OrderBook();
        orderBook.parseFromList(inList);

        List<String> actual = orderBook.parseToList();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFourthExample() {
        System.out.println("\t\t@testFourthExample");

        List<String> inList = FileUtil.readTextFileToList("./project/test4_in.txt");
        if (inList.size() == 0) {
            System.out.println("File test4_in is empty");
            return;
        }
        List<String> expected = FileUtil.readTextFileToList("./project/test4_out.txt");
        if (inList.size() == 0) {
            System.out.println("File test4_out is empty");
            return;
        }
        OrderBook orderBook = new OrderBook();
        orderBook.parseFromList(inList);

        List<String> actual = orderBook.parseToList();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFivethExample() {
        System.out.println("\t\t@testFivethExample");

        List<String> inList = FileUtil.readTextFileToList("./project/test5_in.txt");
        if (inList.size() == 0) {
            System.out.println("File test5_in is empty");
            return;
        }
        List<String> expected = FileUtil.readTextFileToList("./project/test5_out.txt");
        if (inList.size() == 0) {
            System.out.println("File test5_out is empty");
            return;
        }
        OrderBook orderBook = new OrderBook();
        orderBook.parseFromList(inList);

        List<String> actual = orderBook.parseToList();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSixthExample() {
        System.out.println("\t\t@testSixthExample");

        List<String> inList = FileUtil.readTextFileToList("./project/test6_in.txt");
        if (inList.size() == 0) {
            System.out.println("File test6_in is empty");
            return;
        }
        List<String> expected = FileUtil.readTextFileToList("./project/test6_out.txt");
        if (inList.size() == 0) {
            System.out.println("File test6_out is empty");
            return;
        }
        OrderBook orderBook = new OrderBook();
        orderBook.parseFromList(inList);

        List<String> actual = orderBook.parseToList();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSeventhExample() {
        System.out.println("\t\t@testSeventhExample");

        List<String> inList = FileUtil.readTextFileToList("./project/test7_in.txt");
        if (inList.size() == 0) {
            System.out.println("File test7_in is empty");
            return;
        }
        List<String> expected = FileUtil.readTextFileToList("./project/test7_out.txt");
        if (inList.size() == 0) {
            System.out.println("File test7_out is empty");
            return;
        }
        OrderBook orderBook = new OrderBook();
        orderBook.parseFromList(inList);

        List<String> actual = orderBook.parseToList();

        Assert.assertEquals(expected, actual);
    }
}