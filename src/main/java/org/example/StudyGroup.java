package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
}