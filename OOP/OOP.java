class Student {
    String name;
    int age;
    public void printInfo(){
        System.out.println("**Information**");
        System.out.println(this.name);
        System.out.println(this.age);
    }
      //-----------CONSTRUCTOR
            Student(String name, int age){
            this.name = name;
            this.age = age;
        } // With Parameters
 }
 public class OOP{
     
     public static void main (String[] args){
        Student student = new Student("Parag", 18);
        Student s2 = new Student(student.name, student.age);
        

        //student.name = "Parikshit";
        student.age = 18;
        student.printInfo();
   
    }
}
