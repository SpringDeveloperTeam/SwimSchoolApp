package com.school.app.controller;

import com.school.app.dto.student.StudentRequestDTO;
import com.school.app.dto.student.StudentResponseDTO;
import com.school.app.mapper.IStudentMapper;
import com.school.app.model.Student;
import com.school.app.service.interfaces.student.IStudentService;
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
    private IStudentMapper studentMapper;

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

    @PostMapping(value = "/save", consumes = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<String> saveStudent(@RequestBody StudentRequestDTO studentRequestDTO) throws URISyntaxException {
       studentService.save(studentRequestDTO);
        return ResponseEntity.created(new URI("/save")).body("Student created successfully");
    }
}
