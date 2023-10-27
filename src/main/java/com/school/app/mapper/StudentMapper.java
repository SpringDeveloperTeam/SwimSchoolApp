package com.school.app.mapper;

import com.school.app.dtos.StudentDTO;
import com.school.app.models.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentMapper {
    @Mapping(source = "name", target = "studentName")
    @Mapping(source = "parent.name", target = "parentName")
    @Mapping(source = "parent.invoices", target = "invoices")
    StudentDTO toStudentDTO(Student student);
}
