import java.util.*;

class CollectionDemo {
    public static void main(String[] args) {

        // =======================
        // 1️⃣ Using ArrayList (List)
        // =======================
        List<String> students = new ArrayList<>();
        students.add("Sagar");
        students.add("Amol");
        students.add("Amit");
        students.add("Sagar");   // Duplicate allowed

        System.out.println("Students List (ArrayList): " + students);

        // =======================
        // 2️⃣ Using HashSet (Set)
        // =======================
        Set<String> subjects = new HashSet<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("Java");   // Duplicate ignored

        System.out.println("Subjects Set (HashSet): " + subjects);

        // =======================
        // 3️⃣ Using HashMap (Map)
        // =======================
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Sagar", 85);
        marks.put("Amol", 92);
        marks.put("Amit", 78);

        System.out.println("Marks Map (HashMap): " + marks);

        // Access specific value
        System.out.println("Marks of Amol: " + marks.get("Amol"));

        // =======================
        // 4️⃣ Using PriorityQueue
        // =======================
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(85);
        pq.add(92);
        pq.add(78);

        System.out.println("Top Priority (Lowest Marks First): " + pq.peek());

        System.out.println("Removing Top: " + pq.poll());
        System.out.println("Next Top: " + pq.peek());


        // =======================
        // 5️⃣ Using Iterator
        // =======================
        System.out.println("\nIterating Students using Iterator:");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new ArrayDeque<Integer>();
        Queue<Integer> q3 = new PriorityQueue<Integer>();

        ArrayDeque<Integer> q4 = new ArrayDeque<Integer>();


        q2.add(20);
        q2.add(30);
        q2.add(null);
        System.out.println("\nQueue using ArrayDeque: " + q2);


        q4.add(20);
        q4.addLast(90);
        q4.add(30);
        q4.add(10);
        q4.addFirst(70);
        q4.add(50);
        q4.addFirst(80);
        System.out.println(q4);

        q3.remove();
        System.out.println(q4);
        
        q4.removeLast();
        System.out.println(q4);
// ----------------------------------------------------------------------------------
        //when you don't want duplicates and order doesn't matter, use HashSet

        HashSet<String> hs = new HashSet<String>(); 
        // LinkedList<String> hs = new LinkedList<String>();
        // TreeSet<String> hs = new TreeSet<String>();

        hs.add("Sagar");
        hs.add("Amol");
        hs.add("Amit");
        hs.add("Sagar");   // Duplicate ignored
        hs.add("parikshit");
        hs.add(null);      // HashSet allows one null value
        hs.add(null);      // Duplicate null ignored
        

        System.out.println("\nHashSet: " + hs);





    }
}