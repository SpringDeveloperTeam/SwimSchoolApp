package com.school.app.service.interfaces.student;

import java.util.List;
import com.school.app.model.Student;

public interface IStudentService {
     List<Student> findAll();
     Student findById(Long id);
     void save(Student student);
}
