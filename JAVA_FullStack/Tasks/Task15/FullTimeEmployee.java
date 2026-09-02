// Derived Class: FullTimeEmployee
class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(int empId, String name, double baseSalary, double bonus) {
        super(empId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
} 