class Polymorphism {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("Name is : "+ name);
    }
    public void printInfo(int age){
        System.out.println("Age is " + age);
    }
    public void printInfo(String name, int age){
        System.out.println("name is " + name + "Age is "+ age);
    }
    
}

public class Demo {
        public static void main(String [] args){
        Polymorphism pol = new Polymorphism();
        pol.printInfo(pol.name, pol.age);
        pol.name = "Parikshit";
        pol.age = 19;
       

}
}