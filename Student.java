package src.cse114;

public class Student extends Person{

    public String status;

    @Override
    public String toString() {
        return "Student{" +
                "status='" + status + '\'' +
                '}';
    }
}
