// import java.util.Scanner;

public class Students {
    static String cname = "Sinhgad College of Engineering";
    static int totalStudents = 3;
    static float passingMarks = 28;

    public String sname;
    public int rollno;
    public float marks;
    public char grade;

    Students(String name, int rollno, float marks) {
        this.sname = name;
        this.rollno = rollno;
        this.marks = marks;
        
    }

    public void gradeCalculation() {
        if (marks >= 70) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else if (marks >= 40) {
            grade = 'D';
        } else {
            System.out.println("You are failed..!");
        }

    }

    public void displayDetails() {
        System.out.println("College Initializes..");
        System.out.println();
        System.out.println("College Name: " + cname);
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + sname);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println();
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Students s1 = new Students("Parikshit", 1, 75);
        Students s2 = new Students("Rahul", 2, 65);
        Students s3 = new Students("Sneha", 3, 45);

        //obj creation
        s1.gradeCalculation();
        s2.gradeCalculation();
        s3.gradeCalculation();
        // Displaying the details of students
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

    }

}
