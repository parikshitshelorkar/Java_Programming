import java.util.Scanner;
public class Box {
    //
    double width ;
    double height;
    double depth;
    // method 
    void volume (){
        System.out.println("Volume is ");
        System.out.println(width*height*depth);
    }

}

class DemoBox {
    //main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Box mybox1 = new Box();
        System.out.println("Enter the Width, Height and Depth");
        mybox1.width = scan.nextInt();
        mybox1.height = scan.nextInt();
        mybox1.depth = scan.nextInt();
        mybox1.volume();
        scan.close();
        
    }
}