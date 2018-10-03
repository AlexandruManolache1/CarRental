package ro.jademy.carrental.Car;

import java.math.BigDecimal;

/**
 * Created by alexandrumanolache on 27/09/2018.
 */
public class BMW extends Car {

    private boolean sunroof;

    public BMW(String make, String model, Integer year, String carType, Integer doorNumber,
        String color, String transmissionType, BigDecimal basePrice, BigDecimal priceNew, Engine engine,
        boolean sunroof) {

        super(make, model, year, carType, doorNumber, color, transmissionType, basePrice, priceNew, engine);
        this.sunroof = sunroof;
    }

    public BMW(String make, String model, Integer year, String carType, Integer doorNumber,
        String color, String transmissionType, BigDecimal basePrice, BigDecimal priceNew, Engine engine,
        boolean sunroof, boolean isRented) {

        super(make, model, year, carType, doorNumber, color, transmissionType, basePrice, priceNew, engine, isRented);
        this.sunroof = sunroof;
    }
}
