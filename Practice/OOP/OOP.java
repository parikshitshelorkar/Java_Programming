//  THIS IS THE EXAMPLE ABSTRACTION USING KEYWORD


abstract class Animal {                    //Abstract class
    abstract void walk ();             // Abstract function
    public void eat (){          //This method is accessible to child classes
        System.out.println("Animal Eats");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on four legs");
    }
}
class Human extends Animal{
    public void walk(){
        System.out.println("Walks on two legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on two legs");
    }
}
public class OOP {
    public static void main(String[] args){
        Horse horse = new Horse();
        Human human = new Human();
        //Animal animal = new Animal();
        horse.eat();
        horse.walk();
    }

    
}