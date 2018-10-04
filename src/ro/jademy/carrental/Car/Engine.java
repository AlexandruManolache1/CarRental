package ro.jademy.carrental.Car;

/**
 * Created by alexandrumanolache on 27/09/2018.
 */
public class Engine {

    Integer horsePower;
    Integer kwPower;
    Integer consumption;
    String fuelType;


    public Engine(Integer horsePower, Integer kwPower, Integer consumption, String fuelType) {
        this.horsePower = horsePower;
        this.kwPower = kwPower;
        this.consumption = consumption;
        this.fuelType = fuelType;
    }
}
