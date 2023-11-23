package com.school.app.dto.student;

import com.school.app.dto.parent.ParentDTO;
import com.school.app.dto.teacher.TeacherDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDTO {
    private String name;
    private String lastName;
    private byte age;
    private ParentDTO parent;
    private TeacherDTO teacher;
}
