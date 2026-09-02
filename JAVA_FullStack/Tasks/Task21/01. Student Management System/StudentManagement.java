import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

    int studentId;
    String name;
    String course;
    double marks;

    Student(int studentId, String name, String course, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }


interface StudentService {

    void addStudent(Student s);

    void removeStudent(int id);

    Student searchStudent(int id);

    void displayAllStudents();
}

class StudentServiceImpl implements StudentService {

    List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(int id) {

        for(Student s : students) {
            if(s.studentId == id) {
                students.remove(s);
                break;
            }
        }
    }

    public Student searchStudent(int id) {

        for(Student s : students) {
            if(s.studentId == id) {
                return s;
            }
        }

        return null;
    }

    public void displayAllStudents() {

        for(Student s : students) {
            System.out.println(s.studentId + " " + s.name + " " + s.course + " " + s.marks);
        }
    }
    
}

public class StudentManagement {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();

        while(true){

            System.out.println("1 Add Student");
            System.out.println("2 Remove Student");
            System.out.println("3 Search Student");
            System.out.println("4 Display Students");
            System.out.println("5 Exit");

            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter Student Id:");
                    int id = sc.nextInt();
                    System.out.println("Enter Student Name:");
                    String name = sc.next();
                    System.out.println("Enter Student Course:");
                    String course = sc.next();
                    System.out.println("Enter Student Marks:");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, course, marks);
                    studentService.addStudent(s);
                    break;

                case 2:
                    System.out.println("Enter Student Id to Remove:");
                    int removeId = sc.nextInt();
                    studentService.removeStudent(removeId);
                    break;

                case 3:
                    System.out.println("Enter Student Id to Search:");
                    int searchId = sc.nextInt();
                    Student foundStudent = studentService.searchStudent(searchId);
                    if(foundStudent != null) {
                        System.out.println(foundStudent.studentId + " " + foundStudent.name + " " + foundStudent.course + " " + foundStudent.marks);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    studentService.displayAllStudents();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice. Try Again.");
            }

        }
    }
}

//polymorphism with List interface
//List<Student> students = new ArrayList<>();