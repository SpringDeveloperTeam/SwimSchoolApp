package com.school.app.controllers;

import com.school.app.dtos.student.StudentRequestDTO;
import com.school.app.dtos.student.StudentResponseDTO;
import com.school.app.mapper.StudentMapper;
import com.school.app.models.Student;
import com.school.app.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/findAll")
    public ResponseEntity<List<StudentResponseDTO>> getStudents() {
        List<StudentResponseDTO> studentDTOS = studentMapper.toStudentsDTO(studentService.findAll());
        return ResponseEntity.ok(studentDTOS);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<StudentResponseDTO> getStudentById(@PathVariable Long id) {
        StudentResponseDTO student = studentMapper.toStudentDTO(studentService.findById(id));
        return ResponseEntity.ok(student);
    }

    @PostMapping(value = "/save", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> saveStudent(@RequestBody StudentRequestDTO studentRequestDTO) throws URISyntaxException {
       Student studentEntity = studentMapper.toStudent(studentRequestDTO);
       studentService.save(studentEntity);
        return ResponseEntity.created(new URI("/save")).body("Student created successfully");
    }
}
