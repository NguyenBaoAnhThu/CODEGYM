package TTTimKiem.DEMO;

import java.util.List;

public class main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student(1,"John",20,"Male"));
        studentManager.addStudent(new Student(2,"Jane",30,"Female"));
        studentManager.addStudent(new Student(3,"Bob",40,"Male"));
        studentManager.addStudent(new Student(4,"Mary",50,"Female"));
        studentManager.addStudent(new Student(5,"John",60,"Male"));
        studentManager.addStudent(new Student(6,"Jane",70,"Female"));
        studentManager.addStudent(new Student(7,"Jane",80,"Male"));
        studentManager.addStudent(new Student(8,"Jane",90,"Female"));
        List<Student> studentName = studentManager.searchStudentByName("John");
        System.out.println(studentName);

        Student studentId = studentManager.searchStudentById(1);
        System.out.println(studentId);
    }
}
