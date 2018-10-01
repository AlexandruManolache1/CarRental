package ro.jademy.carrental.Car;

/**
 * Created by alexandrumanolache on 01/10/2018.
 */
public class Mercedes extends  Car{

    private boolean leather;

    public Mercedes(String make, String model, Integer year, String carType, Integer doorNumber, String color,
        String transmissionType, String basePrice, String priceNew, Engine engine, boolean leather,boolean rented) {
        super(make, model, year, carType, doorNumber, color, transmissionType, basePrice, priceNew, engine,rented);
        this.leather = leather;
    }


}
