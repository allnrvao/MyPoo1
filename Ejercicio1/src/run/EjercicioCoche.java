package run;

import models.Car;

public class EjercicioCoche {
    public static void main(String[] args) {

        Car car = new Car();
        car.carBrand = "Toyota";
        car.carYear = 2025;
        car.carModel = "Land Cruiser PRADO";

        System.out.println(car.showCarData());
    }
}
