package ro.jademy.carrental.Car;

public abstract class Car {

    // Q: how can we better represent the car make?
    public String make;
    public String model;
    public Integer year;
    private String carType;
    private Integer doorNumber;
    private String color;
    private String transmissionType;
    private String basePrice;
    private  String priceNew;
    private boolean rented;

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
        String color, String transmissionType, String basePrice, String priceNew, Engine engine,boolean rented) {
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
        this.rented = rented;
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

    public String getBasePrice() {
        return basePrice;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getPriceNew() {
        return priceNew;
    }

    public boolean isRented() {
        return rented;
    }

    @Override
    public String toString() {
        return
            "make='" + make + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            ", carType='" + carType + '\'' +
            ", doorNumber=" + doorNumber +
            ", color='" + color + '\'' +
            ", transmissionType='" + transmissionType + '\'' +
            ", basePrice='" + basePrice + '\'' +
            ", priceNew='" + priceNew + '\'' +
            ", engine=" + engine +
            '}';
    }
}
