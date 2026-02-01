import java.util.Scanner;

public class Employee {
    int empId[];
    String empName[];
    String department[];
    float basicSalary[];
    int numOfEmployees;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Employees:");
        numOfEmployees = sc.nextInt();
        empId = new int[numOfEmployees];
        empName = new String[numOfEmployees];
        department = new String[numOfEmployees];
        basicSalary = new float[numOfEmployees];

        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            empId[i] = sc.nextInt();
            System.out.print("Name: ");
            empName[i] = sc.next();
            System.out.print("Department: ");
            department[i] = sc.next();
            System.out.print("Basic Salary: ");
            basicSalary[i] = sc.nextFloat();
            System.out.println("-------------------");

        }
    }

    void displayDetails() {
        System.out.println("Index   ID  Name    Department  Basic Salary");
        for (int i = 0; i < numOfEmployees; i++) {
            System.out
                    .println((i + 1) + " " + empId[i] + " " + empName[i] + " " + department[i] + " " + basicSalary[i]);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }

    }

    int searchById(int key) {
        // empId
        for (int i = 0; i < numOfEmployees; i++) {
            if (key == empId[i]) {
                System.out.println("Employee ID found at Index: " + i + 1);

            } else {

                System.out.println("The Employee ID Not Found..!");
            }
        }
        return 0;
    }

    float calculateSalary(int empId) {
        int index = searchById(empId);
        float hra = (2 * basicSalary[index]) / 10;
        float da = (1 * basicSalary[index]) / 10;
        float grossSalary = hra + da + basicSalary[index];
        System.out.println("The total Gross Salary is: " + grossSalary);
        return grossSalary;

    }

    float maxSalary() {
        float max = basicSalary[0];
        for (int i = 0; i < numOfEmployees; i++) {
            if (max < basicSalary[i]) {
                max = basicSalary[i];
            }
        }
        return max;

    }

    float minSalary() {
        float min = basicSalary[0];
        for (int i = 0; i < numOfEmployees; i++) {
            if (min > basicSalary[i]) {
                min = basicSalary[i];
            }
        }
        return min;
    }

    int countEmployees(String dept) {
        int count = 0;
        for (int i = 0; i < numOfEmployees; i++) {
            if (dept == department[i]) {
                count += 1;
            }
            return count;
        }
        System.out.println("The number of employee in " + dept + ": " + count);
        return 0;
    }

    float updateSalary(int empId, float newSalary) {
        int index = searchById(empId);
        System.out.println("The old Salary " + basicSalary[index] + " is changed to: " + newSalary);
        return basicSalary[index] = newSalary;

    }

    // void showMenu() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        while (true) {
            // Method to show menu options
            System.out.println("Menu Options:");
            System.out.println("1. Add Employee Details");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Calculate Gross Salary");
            System.out.println("5. Find Highest & Lowest Salary");
            System.out.println("6. Count Employees by Department");
            System.out.println("7. Update Employee Salary");
            System.out.println("8. Exit");

            System.out.println("Enter your Choice..!");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    e.acceptDetails();
                    break;
                case 2:
                    e.displayDetails();
                    break;
                case 3:
                    int id;
                    System.out.println("Enter the ID to search: ");
                    id = sc.nextInt();
                    e.searchById(id);
                    break;
                case 4:
                    System.out.println("Enter the ID to calculate Gross Salary: ");
                    id = sc.nextInt();
                    e.calculateSalary(id);
                    break;
                case 5:
                    System.out.println("Minimum salary is: " + e.minSalary());
                    System.out.println("Maximum salary is: " + e.maxSalary());
                    break;
                case 6:
                    String dept;
                    System.out.println("Enter the department: ");
                    dept = sc.nextLine();
                    e.countEmployees(dept);
                    break;
                case 7:
                    System.out.println("Enter ID and New Salary of the Employee: ");
                    id = sc.nextInt();
                    float newslary = sc.nextFloat();
                    e.updateSalary(id, newslary);
                    break;
                case 8:
                    System.out.println("Exiting the Program...!");
                    return;
                default:
                    System.out.println("Invalid Input..!");

                    break;
            }

        }
    }
}