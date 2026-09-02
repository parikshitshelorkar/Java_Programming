

// Main Class
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new FullTimeEmployee(101, "Amit", 30000, 5000);
        employees[1] = new PartTimeEmployee(102, "Neha", 0, 80, 200);
        employees[2] = new ContractEmployee(103, "Raj", 0, 25000);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}

