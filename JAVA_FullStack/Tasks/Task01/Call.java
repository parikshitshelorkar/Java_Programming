import java.util.Scanner;

class Employee{

    //Data Members
    int empId;
    float salary;
    String name, gender;

    Employee(int empId, String name, float salary, String gender) {
        this.empId = empId;
        this.salary = salary;
        this.name = name;
        this.gender = gender;
    }
     
    //Member Function
    void getData(){
        System.out.println("Name: "+ this.name);
        System.out.println("Employee ID: "+ this.empId);
        System.out.println("Salary : "+ this.salary);
        System.out.println("Gender: "+ this.gender);

    }
    void showBonus(){
        double Bonus; // Changed type to double
        Bonus = 0.1 * this.salary; // Fixed type mismatch
        // Ensure parameter name is different
        System.out.println("Bonus: " + Bonus); // Use Bonus
    }
}
public class Call{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Resource leak fixed
        System.out.println("Enter your Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Name : ");
        String name = sc.nextLine();
        System.out.println();
        System.out.println("Enter your Salary : ");
        float salary = sc.nextInt();
        System.out.println();
        System.out.println("Enter your Gender: ");
        sc.nextLine();
        String gender = sc.nextLine();

        Employee e = new Employee(empId, name, salary, gender );
        e.getData(); // Call getData
        e.showBonus(); // Call showBonus
        sc.close(); // Close the Scanner after use



        
    }
}
