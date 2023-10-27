package com.school.app.controllers;

import java.util.List;
import com.school.app.models.Invoice;
import com.school.app.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.dtos.StudentDTO;
import com.school.app.models.Student;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/findAll")
    public List<StudentDTO> getStudents() {
        List<Student> students = studentService.findAll();

        return students.stream()
                .map(student -> StudentDTO.builder()
                        .studentName(student.getName())
                        .parentName(student.getParent().getName())
                        .lastPayment(student.getParent().getInvoices().stream()
                                .findFirst()
                                .orElse(new Invoice())
                                .getDateOfPaid())
                        .build())
                .toList();
    }

    @GetMapping("/findById/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {

        Student student = studentService.findById(id);

        return StudentDTO.builder()
                .studentName(student.getName())
                .parentName(student.getParent().getName())
                .lastPayment(student.getParent()
                        .getInvoices().stream()
                        .findFirst()
                        .orElse(new Invoice())
                        .getDateOfPaid())
                .build();
    }
}
