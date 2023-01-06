package src.cse114;

public class Employee extends Person{
    public String office;
    public double salary;
    public int experience;

    @Override
    public String toString() {
        return super.toString() +  "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}' ;
    }
}
