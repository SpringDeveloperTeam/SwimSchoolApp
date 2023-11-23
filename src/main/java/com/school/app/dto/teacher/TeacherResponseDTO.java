package com.school.app.dto.teacher;

import java.util.List;
import com.school.app.dto.calendar.CalendarEntityDTO;
import com.school.app.dto.student.StudentResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherResponseDTO {
    private String profession;
    private List<StudentResponseDTO> students;
    private List<CalendarEntityDTO> calendarList;
}
