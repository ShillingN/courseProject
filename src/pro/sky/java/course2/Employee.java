package pro.sky.java.course2;

public class Employee {

    private final String fullname;
    private int department;
    private int salary;

    public Employee(String fullname, int department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
    }

    public String getFullname() {
        return this.fullname;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }

    public static int id = 0;
}
