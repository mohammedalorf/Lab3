import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
     public static List<List<String>> createRandomGroups(List<String> students, int groupSize) {
        // Shuffle the students to randomize the order
        Collections.shuffle(students);

        List<List<String>> groups = new ArrayList<>();
        int totalStudents = students.size();

        // Create groups
        for (int i = 0; i < totalStudents; i += groupSize) {
            // Create a sublist for each group
            List<String> group = new ArrayList<>(students.subList(i, Math.min(i + groupSize, totalStudents)));
            groups.add(group);
        }

        return groups;
    }
     public static void readStudents(List<String> students) {
        System.out.println("Reading student list... 🎓");
        for (String student : students) {
            System.out.println("📚 Student Name: " + student);
        }
    }
    public static void main(String[] args) throws Exception {
        List<String> students = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hannah"));
        List<List<String>> groups = createRandomGroups(students, 3);

        // Print out the groups
        int groupNumber = 1;
        for (List<String> group : groups) {
            System.out.println("Group " + groupNumber + ": " + group);
            groupNumber++;
        }
       
    }
}
