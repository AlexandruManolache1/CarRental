package ro.jademy.carrental.Car;

import java.math.BigDecimal;

/**
 * Created by alexandrumanolache on 01/10/2018.
 */
public class Mercedes extends Car {

    private boolean leather;

    public Mercedes(String make, String model, Integer year, String carType, Integer doorNumber, String color,
        String transmissionType, BigDecimal basePrice, BigDecimal priceNew, Engine engine, boolean leather) {
        super(make, model, year, carType, doorNumber, color, transmissionType, basePrice, priceNew, engine);
        this.leather = leather;
    }

    public Mercedes(String make, String model, Integer year, String carType, Integer doorNumber, String color,
        String transmissionType, BigDecimal basePrice, BigDecimal priceNew, Engine engine, boolean leather,
        boolean isRented) {
        super(make, model, year, carType, doorNumber, color, transmissionType, basePrice, priceNew, engine, isRented);
        this.leather = leather;
    }


}
