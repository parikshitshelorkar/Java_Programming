import java.util.Scanner;

class Employee{
    int empId;
    String empName;
    String department;
    float bsasicSalary; 

    Employee(int empId, String empName, String department, float bsasicSalary){
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.bsasicSalary = bsasicSalary;
    }
    void display(){
        System.out.println("========");
        System.out.println("ID : " + empId);
        System.out.println("Name : " + empName);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + bsasicSalary);
    }
    void saveDetails(){
        System.out.println("Enter number of Employees:");
            
        
        System.out.println("Details Saved Successfully");
    }
}


public class Operations {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        
    }
}