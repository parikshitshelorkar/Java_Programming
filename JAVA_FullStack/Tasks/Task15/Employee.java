// Base Class
class Employee {
    int empId;
    String name;
    double baseSalary;

    // Constructor
    Employee(int empId, String name, double baseSalary) {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Methods
    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

    double calculateSalary() {
        return baseSalary;
    }
}

