package ro.jademy.carrental;

import ro.jademy.carrental.Car.BMW;
import ro.jademy.carrental.Car.Car;
import ro.jademy.carrental.Car.Engine;
import ro.jademy.carrental.Car.Mercedes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    // Q: what fields and methods should this class contain?


    private ArrayList<Salesman> salesmen = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Car> filteredCars = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private ArrayList<Car> choosenCars = new ArrayList<>();

    public Shop() {
        Salesman salesman1 = new Salesman("alex", "m", "alexm", "1234");
        Salesman salesman2 = new Salesman("gigi", "b", "gigib", "1234");
        Salesman salesman3 = new Salesman("dica", "n", "dican", "1234");
        salesmen.add(salesman1);
        salesmen.add(salesman2);
        salesmen.add(salesman3);

        cars.add(
            new BMW("BMW", "S3", 2015, "Saloon", 5, "Red", "Aut", new BigDecimal(50), new BigDecimal(60000),
                new Engine(190, 110, 5, "Petrol"),
                true, false));
        cars.add(new Mercedes("Mercedes", "E", 2015, "Coupe", 3, "Black", "Manual", new BigDecimal(60),
            new BigDecimal(70000),
            new Engine(200, 150, 9, "Diesel"), true, false));
        cars.add(
            new Mercedes("Mercedes", "S", 2016, "Saloon", 3, "Black", "Aut", new BigDecimal(80), new BigDecimal(90000),
                new Engine(250, 200, 10, "Petrol"), true, true));
    }


    public boolean login(String username, String password) {

        for (Salesman salesman : salesmen) {
            if (username.equals(salesman.getUser()) && password.equals(salesman.getPassword())) {
                return true;
            }
        }
        System.out.println("Incorrect credentials");
        return false;
    }

    public void loginScreen() {

        boolean succesLogin;
        do

        {

            System.out.println("Welcome.    Please log in\n");
            System.out.println("User: ");
            String username = sc.next();
            System.out.println("Password: ");
            String password = sc.next();
            succesLogin = login(username, password);
            if (login(username, password)) {
                showMenu();
            }
        } while (!succesLogin);
    }


    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Detailed Search");
        System.out.println("5. Logout");
        System.out.println("6. Exit");

        int choiceOption = sc.nextInt();
        switch (choiceOption) {
            case 1: {
                showAllCars();
                showMenu();
                break;
            }
            case 2: {
                showAvailableCars();
                showMenu();
                break;
            }
            case 3: {
                showRentedCars();
                showMenu();
                break;
            }
            case 4: {
                showListMenuOptions();
                break;
            }
        }
    }


    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs
        System.out.println("4. Back to previous menu");

        int choiceOption = sc.nextInt();

        switch (choiceOption) {
            case 1: {
                showCarsbyMake();
                showListMenuOptions();
                break;
            }
            case 2: {
                showCarsbyModel();
                showListMenuOptions();
                break;
            }
            case 3: {
                showCarsbyBudget();
                showListMenuOptions();
                break;
            }
            case 4: {
                showMenu();
                break;
            }
        }


    }

    public void showAllCars() {
        showCars(cars);
        chooseCar();
    }

    public void showCarsbyMake() {

        filteredCars.clear();
        System.out.println("Enter the make");
        String searchMake = sc.next();
        for (Car car : cars) {
            if (car.make.equalsIgnoreCase(searchMake)) {
                filteredCars.add(car);
            }
        }
        showCars(filteredCars);
        chooseCar();
    }


    public void showCarsbyModel() {

        filteredCars.clear();
        System.out.println("Enter the model");
        String searchModel = sc.next();
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(searchModel)) {
                filteredCars.add(car);
            }
        }
        showCars(filteredCars);
        chooseCar();
    }


    public void showCarsbyBudget() {

        filteredCars.clear();
        System.out.println("enter maximmum budget available");
        Integer budget = sc.nextInt();
        for (Car car : cars) {
            if (BigDecimal.valueOf(budget).compareTo(car.getBasePrice()) > 0) {

                filteredCars.add(car);
            }
        }
        showCars(filteredCars);
        chooseCar();
    }

    public void showAvailableCars() {

        filteredCars.clear();
        for (Car car : cars) {
            if (!car.getCarState().isRented()) {
                filteredCars.add(car);
            }
        }
        showCars(filteredCars);
        chooseCar();
    }


    public void showRentedCars() {

        filteredCars.clear();
        for (Car car : cars) {
            if (car.getCarState().isRented()) {
                filteredCars.add(car);
            }
        }

        showCars(filteredCars);
    }


    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void showCars(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println((cars.indexOf(car) + 1) + " " + car.showcardetails());
        }
    }

    public void chooseCar() {
        System.out.println("If you want to rent please type the car number.\n If no, please type 0 to return to menu");
        Integer carOption = sc.nextInt();
        if (carOption > 0) {
            Car car = cars.get(carOption - 1);
            car.getCarState().setRented(true);
            choosenCars.add(car);
        }
        if (carOption == 0) {
            return;
        }
    }
}
