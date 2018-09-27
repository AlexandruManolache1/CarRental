package ro.jademy.carrental;

import java.math.BigDecimal;

public abstract class Car {

    // Q: how can we better represent the car make?
    public String make;
    public String model;
    public Integer year;
    private String carType;
    private String fuelType;
    private Integer doorNumber;
    private String color;
    private String transmissionType;
    private String basePrice;
    private  String priceNew;

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


    public Car(String make, String model, Integer year, String carType, String fuelType, Integer doorNumber,
        String color, String transmissionType, String basePrice, String priceNew, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.fuelType = fuelType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.transmissionType = transmissionType;
        this.basePrice = basePrice;
        this.priceNew = priceNew;
        this.engine = engine;
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

    public String getFuelType() {
        return fuelType;
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

    public String getBasePrice() {
        return basePrice;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getPriceNew() {
        return priceNew;
    }
}
