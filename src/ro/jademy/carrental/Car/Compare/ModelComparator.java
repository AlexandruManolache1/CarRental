package ro.jademy.carrental.Car.Compare;

import ro.jademy.carrental.Car.Car;

import java.util.Comparator;

/**
 * Created by alexandrumanolache on 15/10/2018.
 */
public class ModelComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.model.compareTo(o2.model);
    }
}
