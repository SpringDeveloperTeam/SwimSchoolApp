package com.school.app.controllers;

import java.util.List;

import com.school.app.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.models.Student;
import com.school.app.services.StudentService;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping(path = "/findAll")
    public List<Student> getStudents() {
        return studentService.findAll();
    }

    @GetMapping(path = "/findById/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }
}
