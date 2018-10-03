package ro.jademy.carrental.Car;

import java.util.Date;

/**
 * Created by alexandrumanolache on 03/10/2018.
 */
public class CarState {

    private boolean rented;
    private Date startDate;
    private Date endDate;

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
