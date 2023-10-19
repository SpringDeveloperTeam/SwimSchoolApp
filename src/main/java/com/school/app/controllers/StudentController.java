package com.school.app.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.models.Student;
import com.school.app.services.StudentService;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
