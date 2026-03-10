import java.util.HashSet;
import java.util.LinkedHashSet;

public class setDemo{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Sagar");
        set.add("Amol");
        set.add("Amit");
        set.add(null); 
        set.add("Sagar");   // Duplicate ignored

        System.out.println("HashSet: " + set);


        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Sagar");
        linkedSet.add("Amol");
        linkedSet.add("Amit");
        linkedSet.add(null);        
        System.out.println("LinkedHashSet: " + linkedSet);


        

    }
}