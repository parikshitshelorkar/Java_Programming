// Derived Class: ContractEmployee
class ContractEmployee extends Employee {
    double contractAmount;

    ContractEmployee(int empId, String name, double baseSalary, double contractAmount) {
        super(empId, name, baseSalary);
        this.contractAmount = contractAmount;
    }

    @Override
    double calculateSalary() {
        return contractAmount;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Contract Amount: " + contractAmount);
        System.out.println("Total Salary: " + calculateSalary());
    }
}