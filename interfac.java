interface Person {
    String getFirstName();
    String getLastName();
    int getAge();
}
class Student implements Person {
    private String firstName;
    private String lastName;
    private int age;
    private int studentId;

    public Student(String firstName, String lastName, int age, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public int getStudentId() {
        return studentId;
    }
}
public class interfac {
    public static void main(String[] args) {
        Student student = new Student("Mohsin", "Siam", 18, 664900);
        System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
    }
}
