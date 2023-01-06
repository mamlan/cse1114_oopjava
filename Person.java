package src.cse114;

public class Person {
    public String name, address, emailAddress;
    public int phoneNumber;

    @Override
    public String toString() {
        return "Person " +
                "\nname='" + name;
    }
}
