package com.company;

public class ServiceStation implements PrintInfoService {
    @Override
    public void check(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            Bicycle bicycle = bicycles[i];
            System.out.println("Bicycle: " + bicycle.getModelName());
            for (int j = 0; j < bicycle.getWheelsCount(); j++) {
                bicycle.updateTyre();
            }
            System.out.println();
        }
        System.out.println("____________");
    }

    @Override
    public void check(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Car: " + car.getModelName());
            for (int j = 0; j < car.getWheelsCount(); j++) {
                car.updateTyre();
            }
            car.checkEngine();
            System.out.println();
        }
        System.out.println("____________");
    }


    @Override
    public void check(Truck[] trucks) {
        for (int i = 0; i <trucks.length; i++) {
            Truck truck = trucks[i];
            System.out.println("Truck: " + truck.getModelName());
            for (int j = 0; j < truck.getWheelsCount(); j++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
            System.out.println();
        }
        System.out.println("____________");
    }
}

