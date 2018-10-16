package ro.jademy.carrental.Car;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.swing.*;


public abstract class Car implements Comparable<Car> {

    // Q: how can we better represent the car make?
    public String make;
    public String model;
    public Integer year;
    private String carType;
    private Integer doorNumber;
    private String color;
    private String transmissionType;
    private BigDecimal basePrice;
    private BigDecimal priceNew;
    private CarState carState = new CarState();

    // Q: how can we better represent the car type?
    //  public enum carType {
    //     COUPE,SEDAN, HATCHBAK, CONVERTIBLE, WAGON, SUV
    //  }

    // Q: how can we better represent the motor type?
    // public enum fuelType {

    //   DIESEL, GASOLINE, ALTERNATIVE
    //  }

    // public Integer doorNumber;

    //  public String color;

    // Q: how can we better represent the transmission type?
    //  public enum transmissionType {
    //      AUTOMATIC, MANUAL
    // }

    // Q: how can we better represent the engine?
    public Engine engine;

    // Q: how can we better represent money value?
    //   public BigDecimal basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?


    public Car(String make, String model, Integer year, String carType, Integer doorNumber,
        String color, String transmissionType, BigDecimal basePrice, BigDecimal priceNew, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.transmissionType = transmissionType;
        this.basePrice = basePrice;
        this.priceNew = priceNew;
        this.engine = engine;
    }

    public Car(String make, String model, Integer year, String carType, Integer doorNumber, String color,
        String transmissionType, BigDecimal basePrice, BigDecimal priceNew, Engine engine, boolean isRented) {

        this(make, model, year, carType, doorNumber, color, transmissionType, basePrice, priceNew, engine);
        this.carState.setRented(isRented);

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCarType() {
        return carType;
    }


    public Integer getDoorNumber() {
        return doorNumber;
    }

    public String getColor() {
        return color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public Engine getEngine() {
        return engine;
    }

    public BigDecimal getPriceNew() {
        return priceNew;
    }

    public CarState getCarState() {
        return carState;
    }


    public String showcardetails() {
        return
            "make|model|year|carType|doorNumber|color|trans|basePrice|priceNew|fuel|consumption|horsePower|kwPower\n"
                + make + "|" + model + "|" + year + "|" + carType + "|" + doorNumber + "|" + color + "|"
                + transmissionType + "|" + basePrice
                + "|" + priceNew + "|" + engine.fuelType + "|" + engine.consumption + "|" + engine.horsePower + "|"
                + engine.kwPower
            ;
    }

    @Override
    public int compareTo(Car o) {
        int makeCompare = this.make.compareTo(o.make);
        if (makeCompare == 0) {
            int basePriceCompare = this.basePrice.compareTo(o.basePrice);
            if (basePriceCompare == 0) {
                int doorNumberCompare = this.doorNumber.compareTo(o.doorNumber);
                if (doorNumberCompare == 0) {
                    return 0;
                }
                return doorNumberCompare;
            }
            return basePriceCompare;
        }
        return makeCompare;
    }
}






