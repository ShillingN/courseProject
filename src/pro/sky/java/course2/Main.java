package pro.sky.java.course2;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Иванов Антон Антонович", 1, 130_000);


        Employee.id = 0;
    }

    public static void printEmployee(Employee employee) {
        System.out.println(employee.getFullname());
    }
}
