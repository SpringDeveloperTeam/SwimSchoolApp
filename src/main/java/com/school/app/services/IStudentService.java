package com.school.app.services;

import com.school.app.models.Student;

public interface IStudentService {
     Iterable<Student> findAll();
     Student findById(Long id);
     void save(Student student);
}
