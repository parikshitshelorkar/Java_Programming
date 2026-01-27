//-------------OOP
class Pen{
    String color;
       public void write(){
        System.out.println("Writitng something ");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class TestOOP{
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
         
        pen1.write();
        pen1.printColor();
    }
}

