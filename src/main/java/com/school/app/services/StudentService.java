package com.school.app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.school.app.models.Student;
import com.school.app.repository.IStudentRepository;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.getStudents();
    }
}
