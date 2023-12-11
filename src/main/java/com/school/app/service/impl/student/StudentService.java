package com.school.app.service.impl.student;

import com.school.app.dto.student.StudentRequestDTO;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.mapper.IStudentMapper;
import com.school.app.model.Parent;
import com.school.app.model.Student;
import com.school.app.model.Teacher;
import com.school.app.repository.IParentRepository;
import com.school.app.repository.IStudentRepository;
import com.school.app.repository.ITeacherRepository;
import com.school.app.service.interfaces.student.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository;

    private final IParentRepository parentRepository;

    private final ITeacherRepository teacherRepository;

    private final IStudentMapper studentMapper;

    public StudentService(IStudentRepository studentRepository, IParentRepository parentRepository, ITeacherRepository teacherRepository, IStudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.parentRepository = parentRepository;
        this.teacherRepository = teacherRepository;
        this.studentMapper = studentMapper;
    }

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
    public void update(Long studentId, StudentRequestDTO studentRequestDTO) throws ResourceNotFoundException {
        Student actualStudent = studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException(studentId));

        if(studentRequestDTO.getParentId().equals(actualStudent.getParent().getId())){
            Parent optParent = this.parentRepository.findById(studentRequestDTO.getParentId()).orElseThrow(() -> new ResourceNotFoundException(studentRequestDTO.getParentId()));
            actualStudent.setParent(optParent);
        }

        if(studentRequestDTO.getTeacherId().equals(actualStudent.getTeacher().getId())){
            Teacher optTeacher = this.teacherRepository.findById(studentRequestDTO.getTeacherId()).orElseThrow(() -> new ResourceNotFoundException(studentRequestDTO.getTeacherId()));
            actualStudent.setTeacher(optTeacher);
        }

        actualStudent.setName(studentRequestDTO.getName());
        actualStudent.setLastName(studentRequestDTO.getLastName());
        actualStudent.setAge(studentRequestDTO.getAge());

        studentRepository.save(actualStudent);
    }

    @Override
    @Transactional
    public void save(StudentRequestDTO studentRequestDTO) throws ResourceNotFoundException {
        Parent optParent = this.parentRepository.findById(studentRequestDTO.getParentId()).orElseThrow(() -> new ResourceNotFoundException(studentRequestDTO.getParentId()));
        Teacher optTeacher = this.teacherRepository.findById(studentRequestDTO.getTeacherId()).orElseThrow(() -> new ResourceNotFoundException(studentRequestDTO.getTeacherId()));

        Student studentEntity = studentMapper.toStudent(studentRequestDTO);
        studentEntity.setParent(optParent);
        studentEntity.setTeacher(optTeacher);

        studentRepository.save(studentEntity);
    }

    @Override
    @Transactional
    public void deleteById(Long idStudent) throws ResourceNotFoundException {
        Student actualStudent = studentRepository.findById(idStudent).orElseThrow(() -> new ResourceNotFoundException(idStudent));
        studentRepository.delete(actualStudent);
    }
}
