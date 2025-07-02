// Abstract class Employee
abstract class Employee {
    // Fields with encapsulation
    private String employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter and setter methods
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Interface Department
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department {
    private double annualSalary;
    private String department;

    public FullTimeEmployee(String employeeId, String name, double annualSalary) {
        super(employeeId, name, 0); // baseSalary not used here
        this.annualSalary = annualSalary;
        this.department = "Unassigned";
    }

    @Override
    public double calculateSalary() {
        // For full-time employees, salary is annual salary divided by 12 months
        return annualSalary / 12;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }

    // Getter and Setter
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department {
    private double hourlyWage;
    private int workHours;
    private String department;

    public PartTimeEmployee(String employeeId, String name, double hourlyWage, int workHours) {
        super(employeeId, name, 0); // baseSalary not used here
        this.hourlyWage = hourlyWage;
        this.workHours = workHours;
        this.department = "Unassigned";
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * workHours;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }

    // Getter and Setter
    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}

// Main class to demonstrate
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create instances
        FullTimeEmployee ftEmp = new FullTimeEmployee("FT001", "Alice", 120000);
        ftEmp.assignDepartment("HR");

        PartTimeEmployee ptEmp = new PartTimeEmployee("PT001", "Bob", 20, 100);
        ptEmp.assignDepartment("Support");

        // List of employees
        Employee[] employees = {ftEmp, ptEmp};

        // Process employees polymorphically
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("------------------------");
        }
    }
}