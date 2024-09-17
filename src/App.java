import java.util.List;

public class App {
     public static void readStudents(List<String> students) {
        System.out.println("Reading student list... 🎓");
        for (String student : students) {
            System.out.println("📚 Student: " + student);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
