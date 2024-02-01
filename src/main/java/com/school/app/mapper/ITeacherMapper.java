package com.school.app.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;
import com.school.app.dto.teacher.TeacherDTO;
import com.school.app.model.Teacher;

@Mapper(
    componentModel = ComponentModel.SPRING,
    uses = {IStudentMapper.class, ICalendarEntityMapper.class})
public interface ITeacherMapper {
  @Mapping(source = "calendarEntityList", target = "calendars")
  TeacherDTO toTeacherResponseDTO(Teacher teacher);

  List<TeacherDTO> teachersResponseDTO(List<Teacher> teachers);
}
