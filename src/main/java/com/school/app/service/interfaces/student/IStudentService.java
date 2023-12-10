package com.school.app.service.interfaces.student;

import java.util.List;
import com.school.app.dto.student.StudentRequestDTO;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Student;

public interface IStudentService {
     List<Student> findAll();
     Student findById(Long studentId);
     void update(Long studentId, StudentRequestDTO studentRequestDTO) throws ResourceNotFoundException;
     void save(StudentRequestDTO studentRequestDTO) throws ResourceNotFoundException;
     void deleteById(Long studentId) throws ResourceNotFoundException;
}
