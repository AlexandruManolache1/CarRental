package ro.jademy.carrental;

import ro.jademy.carrental.Car.BMW;
import ro.jademy.carrental.Car.Car;
import ro.jademy.carrental.Car.Engine;
import ro.jademy.carrental.Car.Mercedes;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    // Q: what fields and methods should this class contain?


    private ArrayList<Salesman> salesmen = new ArrayList<>();
    private ArrayList<Car> Cars = new ArrayList<>();
    private ArrayList<Car> filteredCars = new ArrayList<>();

    public Shop() {
        Salesman salesman1 = new Salesman("alex", "m", "alexm", "1234");
        Salesman salesman2 = new Salesman("gigi", "b", "gigib", "1234");
        Salesman salesman3 = new Salesman("dica", "n", "dican", "1234");
        salesmen.add(salesman1);
        salesmen.add(salesman2);
        salesmen.add(salesman3);

        Cars.add(
            new BMW("BMW", "S3", 2015, "Saloon", 5, "Red", "Aut", "50K", "60K", new Engine(190, 110, 5, "Petrol"),
                true, true));
        Cars.add(new Mercedes("Mercedes", "E", 2015, "Coupe", 3, "Black", "Manual", "60K", "70K",
            new Engine(200, 150, 9, "Diesel"), true, false));
        Cars.add(new Mercedes("Mercedes", "S", 2016, "Saloon", 3, "Black", "Aut", "80K", "90K",
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
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome.    Please log in\n");
            System.out.println("User: ");
            String username = scan.next();
            System.out.println("Password: ");
            String password = scan.next();
            succesLogin = login(username, password);
            if (login(username, password)) {
                showMenu();
            }
        } while (!succesLogin);
    }


    public void showMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Detailed Search");
        System.out.println("5. Logout");
        System.out.println("6. Exit");

        int choiceOption = sc.nextInt();
        switch (choiceOption) {
            case 1: {
                showAllCars();
                break;
            }
            case 2: {
                showAvailableCars();
                break;
            }
            case 3: {
                showRentedCars();
                break;
            }

            case 4: {
                checkIncome();
                break;
            }
            case 5: {
                showListMenuOptions();
                break;
            }
        }
    }


    public void showListMenuOptions() {

        Scanner sc = new Scanner(System.in);

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
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                showRentedCars();                break;
            }

        }


    }

    public void showAllCars() {
        for (Car car : Cars) {
            System.out.println(car.toString());
        }
    }

    public void showCarsbyMake() {

        System.out.println("Enter the make");
        Scanner sc = new Scanner(System.in);
        String searchMake = sc.next();
        for (Car car : Cars) {
            if (car.make.equalsIgnoreCase(searchMake)) {
               filteredCars.add(car);
            }
        }
        System.out.println(filteredCars.toString());
    }


    public void showAvailableCars() {
        for (Car car : Cars) {
            if (!car.isRented()) {
                System.out.println(car.toString());
            }
        }
    }


    public void showRentedCars() {
        for (Car car : Cars) {
            if (car.isRented()) {
                System.out.println(car.toString());
            }
        }

    }

    public void checkIncome() {

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
}
