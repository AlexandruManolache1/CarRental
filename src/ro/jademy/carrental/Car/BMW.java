package ro.jademy.carrental.Car;

/**
 * Created by alexandrumanolache on 27/09/2018.
 */
public class BMW extends Car {

    private boolean sunroof;

    public BMW(String make, String model, Integer year, String carType, Integer doorNumber,
        String color, String transmissionType, String basePrice, String priceNew, Engine engine, boolean sunroof,boolean rented) {

        super(make, model, year, carType, doorNumber, color, transmissionType, basePrice, priceNew, engine,rented);
        this.sunroof = sunroof;
    }
}
