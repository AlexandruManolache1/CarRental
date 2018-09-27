package ro.jademy.carrental;

/**
 * Created by alexandrumanolache on 27/09/2018.
 */
public class BMW extends Car {

    private String sunroof;

    public BMW(String make, String model, Integer year, String carType, String fuelType, Integer doorNumber,
        String color, String transmissionType, String basePrice, String priceNew, Engine engine)
    {
        super("BMW", model, year, carType, fuelType, doorNumber,
            color, transmissionType, basePrice, priceNew, engine);
        this.sunroof = sunroof;
        
    }

}
