package org.example;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1L, "Иванов Иван Иванович");
        List<Student> students = List.of(
                new Student(1L, "Петров Петр Петрович"),
                new Student(2L, "Сидоров Сидор Сидорович")
        );

        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        StudyGroup studyGroup = controller.createStudyGroupWithTeacherAndStudents(teacher, students);

        System.out.println("Учебная группа:");
        System.out.println("Преподаватель: " + studyGroup.getTeacher().getName());
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(" - " + student.getName());
        }
    }
}