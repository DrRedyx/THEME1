package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car[] cars = {
                new Car("BMW", 4),
                new Car("Lada", 4)
        };

        Truck[] trucks = {
                new Truck("Kamaz", 6),
                new Truck("UAZ", 8)
        };

        Bicycle[] bicycles = {
            new Bicycle("Marin", 2),
            new Bicycle("GT", 2)
        };

        PrintInfoService service = new ServiceStation();

        PrintServiceInfo(service, cars, trucks, bicycles);
    }

    private static void PrintServiceInfo(PrintInfoService printInfoService, Car[] cars, Truck[] trucks, Bicycle[] bicycles) {
        printInfoService.check(bicycles);
        printInfoService.check(trucks);
        printInfoService.check(cars);
    }
}
