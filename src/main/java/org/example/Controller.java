package org.example;
import java.util.List;
class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup createStudyGroupWithTeacherAndStudents(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }
}
