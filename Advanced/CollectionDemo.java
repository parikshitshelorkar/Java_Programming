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
    }
}