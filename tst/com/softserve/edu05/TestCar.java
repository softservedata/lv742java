package com.softserve.edu05;

import org.junit.*;

public class TestCar {
    private static Car car1;
    private static Car car2;
    private static Car car3;
    private static Car car4;
    Car[] cars = new Car[]{car1, car2, car3, car4};
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        car1 = new Car("Sidan", 1995, 2.0);
        car2 = new Car("Crossover", 2014, 4.0);
        car3 = new Car("Hatchback", 2014, 3.0);
        car4 = new Car("Bus", 2007, 2.5);
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
    public void testForCar1() {
        System.out.println("\t\t@TesttestForCar Find cars with the same year");
        Car[] actual = Car.findCarWithYear(cars, 2014);
        Car[] expected = new Car[]{car2, car3};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test()
    public void testForCar2() {
        System.out.println("\t\t@TesttestForCar Sort cars");
        Car.sortArr(cars);
        Car[] actual = cars;
        Car[] expected = new Car[]{car1, car4, car2, car3};
        Assert.assertArrayEquals(actual, expected);
    }

}
