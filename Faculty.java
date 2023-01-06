package src.cse114;

public class Faculty extends Employee{
    public String officHours;
    public int rank;

    @Override
    public String toString() {
        return super.toString() + "Faculty{" +
                "rank=" + rank +
                '}';
    }
}
