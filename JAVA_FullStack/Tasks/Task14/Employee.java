import java.util.Scanner;

public class Employee {

    int empId;
    String empName;
    String department;
    double salary;

    Employee() {
        this(0, "Unknown", "Not Assigned", 0.0);
    }

    Employee(int empId, String empName, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    Employee setEmployee(int empId, String empName, String department, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;

        return this;
    }

    void increaseSalary(double amount) {
        this.salary = amount;
        this.displayEmployee();
    }

    void displayEmployee() {
        System.out.println("--------------x------------");
        System.out.println("Name: " + this.empName);
        System.out.println("ID: " + this.empId);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
        System.out.println("--------------x------------");

    }

    double calculateAnnualSalary() {
        return this.salary * 12;
   }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employee emp = new Employee();

    while (true) {
        // Method to show menu options
        System.out.println("Menu Options:");
        System.out.println("1. Add Employee Details");
        System.out.println("2. Update Salary");
        System.out.println("3. Display Employee");
        System.out.println("4. Show Annual Salary");
        System.out.println("5. Exit");
        
        


    
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                System.out.print("Enter Salary: ");
                double sal = sc.nextDouble();
                emp.setEmployee(id, name, dept, sal);
                System.out.println("Employee Added Successfully!");
                break;

            case 2:
                System.out.print("Enter increment amount: ");
                double inc = sc.nextDouble();
                emp.increaseSalary(inc);
                System.out.println("Salary Updated!");
                break;

            case 3:
                emp.displayEmployee();
                break;

            case 4:
                System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
                break;

            case 5:
                System.out.println("Exiting...");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice!");
            }
        }
    }
}

