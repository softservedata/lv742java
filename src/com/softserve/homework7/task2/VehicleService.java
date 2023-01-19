package com.softserve.homework7.task2;

import java.util.List;

public class VehicleService {


    public List<Vehicle> createVehicles() {
        Vehicle plane = new Plane();
        Vehicle helicopter = new Helicopter();
        Vehicle bus = new Bus();
        Vehicle boat = new Boat();
        Vehicle car = new Car();
        Vehicle liner = new Liner();
        Vehicle motorcycle = new Motorcycle();
        return List.of(plane, helicopter, bus, boat, car, liner, motorcycle);
    }


    public void output() {
        List<Vehicle> vehicles = createVehicles();
        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            }
            if(vehicle instanceof GroundVehicle) {
                ((GroundVehicle) vehicle).drive();
            }
            if(vehicle instanceof WaterVehicle) {
                ((WaterVehicle) vehicle).isSailing();
            }

        }
    }



}
