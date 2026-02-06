// This code demonstrates the use of Java Reflection to dynamically load a class, create an instance, and invoke its methods at runtime.
import java.lang.reflect.Method;

// Student class with two methods
class Student {
    public void study() {
        System.out.println("Student is studying...");
    }

    public void giveExam(String subject) {
        System.out.println("Student is giving exam in " + subject);
    }
}

public class Main {

    public static void main(String[] args) {

        try {

            // Load class
            Class<?> cls = Class.forName("Student");

            // Create object
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Call study() method
            Method m1 = cls.getMethod("study");
            m1.invoke(obj);

            // Call giveExam(String) method
            Method m2 = cls.getMethod("giveExam", String.class);
            m2.invoke(obj, "Mathematics");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

