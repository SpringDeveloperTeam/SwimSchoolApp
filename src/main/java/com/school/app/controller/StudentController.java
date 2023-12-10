package com.school.app.controller;

import com.school.app.dto.student.StudentRequestDTO;
import com.school.app.dto.student.StudentResponseDTO;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.mapper.IStudentMapper;
import com.school.app.service.interfaces.student.IStudentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PostMapping(value = "/save")
    public ResponseEntity<String> saveStudent(@RequestBody StudentRequestDTO studentRequestDTO) throws URISyntaxException {
        try {
            studentService.save(studentRequestDTO);
            return ResponseEntity.created(new URI("/update")).body("Student created successfully");
        } catch (ResourceNotFoundException error) {
            return ResponseEntity.internalServerError().body(error.getMessage());
        }
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable(value = "id") Long studentId, @RequestBody StudentRequestDTO studentRequestDTO) {
        try {
            studentService.update(studentId, studentRequestDTO);
            return ResponseEntity.ok("Student updated successfully");
        } catch (ResourceNotFoundException error) {
            return ResponseEntity.internalServerError().body(error.getMessage());
        }
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable(value = "id") String studentId) throws ResourceNotFoundException {
        if (StringUtils.isNotBlank(studentId)) {
            studentService.deleteById(Long.valueOf(studentId));
        }
    }
}
