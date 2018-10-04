package ro.jademy.carrental;


public class Salesman extends Person {

    // Q: how can we avoid duplicate code in the salesman and the customer classes?

    // aici punem user si parola

    private String user;
    private String password;

    public Salesman(String firstName, String lastName, String user, String password) {
        super(firstName, lastName);
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
