package ro.jademy.carrental;

import java.math.BigDecimal;

public abstract class Car {

    // Q: how can we better represent the car make?
    public String make;
    public String model;
    public Integer year;

    // Q: how can we better represent the car type?
    public enum carType {
        COUPE,SEDAN, HATCHBAK, CONVERTIBLE, WAGON, SUV
    }

    ;

    // Q: how can we better represent the motor type?
    public enum fuelType {

        DIESEL, GASOLINE, ALTERNATIVE
    }

    ;

    public Integer doorNumber;

    public String color;

    // Q: how can we better represent the transmission type?
    public enum transmissionType {
        AUTOMATIC, MANUAL
    }

    ;

    // Q: how can we better represent the engine?
    public String engine;

    // Q: how can we better represent money value?
    public BigDecimal basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?
}
