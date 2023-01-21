package com.softserve.edu.homework05.car;

import com.softserve.edu.homework05.array.models.PositionPositiveModel;
import org.junit.*;

public class CarServiceTest {
    private static CarService carService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        carService = new CarService();
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
    public void getCarModelYearTest1() {
        Car car1 = new Car("sedan", 2017, 200);
        Car car2 = new Car("sedan", 2021, 200);
        Car car3 = new Car("sedan", 2006, 200);
        Car actual = carService.getCarModelYear(2006, new Car[]{car1, car2, car3});
        Car expected = car3;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCarModelYearTest2() {
        Car car1 = new Car("sedan", 2017, 200);
        Car car2 = new Car("sedan", 2021, 200);
        Car car3 = new Car("sedan", 2006, 200);
        Car actual = carService.getCarModelYear(2008, new Car[]{car1, car2, car3});
        Car expected = null;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sortCarsTest1() {
        Car car1 = new Car("sedan", 2017, 200);
        Car car2 = new Car("sedan", 2021, 200);
        Car car3 = new Car("sedan", 2006, 200);
        Car[] cars = {car1, car2, car3};
        carService.sortCars(cars);
        Car[] actual = cars;
        Car[] expected = {car3, car1, car2};
        Assert.assertEquals(expected, actual);

    }
}
