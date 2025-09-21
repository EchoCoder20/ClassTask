import java.util.ArrayList;
import java.util.List;

class Employees {
    private String name;
    private double salary;
    private List<Employees> directReports = new ArrayList<>();

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

     public void addDirectReport(Employees employee) {
        this.directReports.add(employee);
    }

    public double getSalary() {
        return salary;
    }

    public List<Employees> getDirectReports() {
        return directReports;
    }
}

public class SalaryCalculator {

    /**
     * Calculates the total salary of an employee and all their subordinates.
     \*
     * @param employee The employee to start the calculation from.
     * @return The total salary.
     */
    public double calculateTotalSalary(Employees employee) {
        // Your implementation here
//        if(employee.getDirectReports().isEmpty())
//        {
//            return employee.getSalary();
//        }


        double total=employee.getSalary();
        for (Employees report : employee.getDirectReports()) {
            total += calculateTotalSalary(report); // add subordinates
        }
        return total;
//        return calculateTotalSalary(employee.getDirectReports().removeFirst())+calculateTotalSalary(employee);
//        return 0.0; // Placeholder
    }

    public static void main(String[] args) {
        Employees ceo = new Employees("CEO", 100000);
        Employees vp1 = new Employees("VP1", 75000);
        Employees vp2 = new Employees("VP2", 80000);
        Employees manager1 = new Employees("Manager1", 60000);
        Employees dev1 = new Employees("Dev1", 50000);
        Employees dev2 = new Employees("Dev2", 55000);

        ceo.addDirectReport(vp1);
        ceo.addDirectReport(vp2);
        vp1.addDirectReport(manager1);
        manager1.addDirectReport(dev1);
        manager1.addDirectReport(dev2);

        SalaryCalculator calculator = new SalaryCalculator();
        double totalSalary = calculator.calculateTotalSalary(ceo);
        System.out.println("Total salary of the organization: " + totalSalary);

        double managerSalary = calculator.calculateTotalSalary(manager1);
        System.out.println("Total salary of Manager1's team: " + managerSalary);
    }
}