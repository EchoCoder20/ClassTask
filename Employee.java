import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

class Employee {
    private String name;
    private double salary;
    private List<Employee> subordinates;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    public double getSalary() {
        return salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String getName() {
        return name;
    }

}

class Organization {

    /**
     * TO-DO: Convert this iterative method into a recursive one.
     \*
     * This method calculates the total salary of a manager and all their subordinates.
     * The current implementation uses a Stack to perform a depth-first traversal of the hierarchy.
     \*
     * @param manager The root employee of the hierarchy to sum up.
     * @return The total salary.
     */
    public double calculateTotalSalary(Employee manager) {
//
        if(manager.getSubordinates().isEmpty())
        {
            return manager.getSalary();
        }

        return calculateTotalSalary(manager.getSubordinates().removeFirst())+calculateTotalSalary(manager);
    }
}
