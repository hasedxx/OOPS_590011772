class Student {
    int id;
    String name;
}

public class objectMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.name = "Hasan";
        System.out.println("Student ID: " + s.id);
        System.out.println("Student Name: " + s.name);
    }
}
