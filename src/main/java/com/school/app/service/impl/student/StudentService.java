package com.school.app.service.impl.student;

import com.school.app.model.Student;
import com.school.app.repository.IStudentRepository;
import com.school.app.service.interfaces.student.IStudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(Student.builder().build());
    }

    @Override
    @Transactional
    public void save(Student student) {
        studentRepository.save(student);
    }
}
