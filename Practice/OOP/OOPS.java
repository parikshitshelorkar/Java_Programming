class Inheritance {
    String color;
}
//Inherit properties from Inheritance class
class Triangle extends Inheritance{
    public void printColor(){
        System.out.println("Color of Triangle is: " + color);
    }
}
public class OOPS{
    public static void main(String args[]){
        System.out.println("This is the main class ");
        //Creating Obj
        Triangle t1 = new Triangle();
        t1.color = "red"; // Assign the props to parent class using child cclass
        t1.printColor();    
    }
}