import rikkei.academy.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("trước khi gán " + student);
        student.setName("Bằng đại za");
        student.setClasses("lớp 0 có");
        System.out.println("sau khi gán " + student);
    }
}
