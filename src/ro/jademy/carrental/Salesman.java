package ro.jademy.carrental;

public class Salesman extends  Person{

    // Q: how can we avoid duplicate code in the salesman and the customer classes?


    // aici punem user si parola
    private String firstName;
    private String lastName;
    private String user;
    private String password ;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCorrectUser() {
        return user;
    }

    public String getCorrectPassword() {
        return password;
    }
}
