public class Abstractt{
    public static void main(String[] args) {
        
    }
}

interface College{
    public static void collegeName(){
        
    }
    void location();
}

interface Hostel{
    void hostelName();
    void location();
}

class Student implements College, Hostel{

}