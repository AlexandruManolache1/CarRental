package ro.jademy.carrental;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: this is the main entry point of our program. What should we do here?


        Scanner scan = new Scanner(System.in);
        System.out.println("Please log in\n");
        System.out.println("User: ");
        String username = scan.next();
        System.out.println("Password: ");
        String password = scan.next();


        Shop shop = new Shop();
        shop.login(username,password);

    }
}
