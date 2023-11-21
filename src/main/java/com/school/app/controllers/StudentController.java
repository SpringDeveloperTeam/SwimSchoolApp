package com.school.app.controllers;

import com.school.app.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.dtos.StudentDTO;
import com.school.app.mapper.StudentMapper;
import com.school.app.models.Student;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/findAll")
    public Iterable<StudentDTO> getStudents() {
        return studentMapper.toStudentsDTO(studentService.findAll());
    }

    @GetMapping("/findById/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        Student student = studentService.findById(id);
        return studentMapper.toStudentDTO(student);
    }
}
