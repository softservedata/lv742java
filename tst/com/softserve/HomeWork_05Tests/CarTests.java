package com.softserve.HomeWork_05Tests;

import com.softserve.HomeWork_05.Car;
import org.junit.*;

public class CarTests {
    private static Car car;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        car = new Car();
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
    public void testAdd1() {
        System.out.println("\t\t@TesttestException()");
        car.setCertainYear(2008);
        String actual = car.output();
        String expected = "Cars of the year 2008:" +
                "\n\tCar: type = CONVERTIBLE, yearOfProduction = 2008, engineCapacity = 5.5.\n" +
                "\nCars ordered by the field year:" +
                "\n\tCar: type = SEDAN, yearOfProduction = 2007, engineCapacity = 4.7." +
                "\n\tCar: type = CONVERTIBLE, yearOfProduction = 2008, engineCapacity = 5.5." +
                "\n\tCar: type = STATION WAGON, yearOfProduction = 2017, engineCapacity = 2.0." +
                "\n\tCar: type = SUV, yearOfProduction = 2018, engineCapacity = 3.0.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd2() {
        System.out.println("\t\t@TesttestException()");
        car.setCertainYear(2007);
        String actual = car.output();
        String expected = "Cars of the year 2007:" +
                "\n\tCar: type = SEDAN, yearOfProduction = 2007, engineCapacity = 4.7.\n" +
                "\nCars ordered by the field year:" +
                "\n\tCar: type = SEDAN, yearOfProduction = 2007, engineCapacity = 4.7." +
                "\n\tCar: type = CONVERTIBLE, yearOfProduction = 2008, engineCapacity = 5.5." +
                "\n\tCar: type = STATION WAGON, yearOfProduction = 2017, engineCapacity = 2.0." +
                "\n\tCar: type = SUV, yearOfProduction = 2018, engineCapacity = 3.0.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd3() {
        System.out.println("\t\t@TesttestException()");
        car.setCertainYear(2017);
        String actual = car.output();
        String expected = "Cars of the year 2017:" +
                "\n\tCar: type = STATION WAGON, yearOfProduction = 2017, engineCapacity = 2.0.\n" +
                "\nCars ordered by the field year:" +
                "\n\tCar: type = SEDAN, yearOfProduction = 2007, engineCapacity = 4.7." +
                "\n\tCar: type = CONVERTIBLE, yearOfProduction = 2008, engineCapacity = 5.5." +
                "\n\tCar: type = STATION WAGON, yearOfProduction = 2017, engineCapacity = 2.0." +
                "\n\tCar: type = SUV, yearOfProduction = 2018, engineCapacity = 3.0.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd4() {
        System.out.println("\t\t@TesttestException()");
        car.setCertainYear(2018);
        String actual = car.output();
        String expected = "Cars of the year 2018:" +
                "\n\tCar: type = SUV, yearOfProduction = 2018, engineCapacity = 3.0.\n" +
                "\nCars ordered by the field year:" +
                "\n\tCar: type = SEDAN, yearOfProduction = 2007, engineCapacity = 4.7." +
                "\n\tCar: type = CONVERTIBLE, yearOfProduction = 2008, engineCapacity = 5.5." +
                "\n\tCar: type = STATION WAGON, yearOfProduction = 2017, engineCapacity = 2.0." +
                "\n\tCar: type = SUV, yearOfProduction = 2018, engineCapacity = 3.0.";
        //
        Assert.assertEquals(expected, actual);
    }

    @Test()
    public void testAdd5() {
        System.out.println("\t\t@TesttestException()");
        car.setCertainYear(2020);
        String actual = car.output();
        String expected = "Cars of the year 2020:" +
                "\n\tThere are no such cars.\n" +
                "\nCars ordered by the field year:" +
                "\n\tCar: type = SEDAN, yearOfProduction = 2007, engineCapacity = 4.7." +
                "\n\tCar: type = CONVERTIBLE, yearOfProduction = 2008, engineCapacity = 5.5." +
                "\n\tCar: type = STATION WAGON, yearOfProduction = 2017, engineCapacity = 2.0." +
                "\n\tCar: type = SUV, yearOfProduction = 2018, engineCapacity = 3.0.";
        //
        Assert.assertEquals(expected, actual);
    }
}
