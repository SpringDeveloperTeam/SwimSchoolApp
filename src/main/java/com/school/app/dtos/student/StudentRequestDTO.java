package com.school.app.dtos.student;

import com.school.app.dtos.parent.ParentDTO;
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
//    private Teacher teacher;
}
