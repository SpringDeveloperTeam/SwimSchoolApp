package com.school.app.services;

import com.school.app.models.Student;

import java.util.List;

public interface IStudentService {
     List<Student> findAll();
     Student findById(Long id);
     void save(Student student);
}
