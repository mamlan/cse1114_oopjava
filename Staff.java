package src.cse114;

public class Staff extends Employee{
    public String title;

    @Override
    public String toString() {
        return super.toString() + "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
