package com.school.app.service.interfaces.student;

import com.school.app.model.Student;

public interface IStudentService {
     Iterable<Student> findAll();
     Student findById(Long id);
     void save(Student student);
}
