package com.school.app.repository;

import com.school.app.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class SpringDataTest {

  @Autowired IStudentRepository studentRepository;

  @Test
  void testFindById() {
    Optional<Student> studentOptional = studentRepository.findById(1L);

    assertNotNull(studentOptional);
    assertTrue(studentOptional.isPresent());
    assertEquals("Jorge", studentOptional.orElseThrow().getName());
    assertEquals("Pérez", studentOptional.orElseThrow().getLastName());
  }

  @Test
  void testFindByIdError() {
    Optional<Student> studentOptional = studentRepository.findById(100L);

    assertFalse(studentOptional.isPresent());
    assertTrue(studentOptional.isEmpty());
    assertNotNull(studentOptional);
  }

  @Test
  void testFindAll() {
    List<Student> studentList = studentRepository.findAll();

    assertNotNull(studentList);
    assertFalse(studentList.isEmpty());
    assertEquals(10, studentList.size());
  }

  @Test
  void testSave() {
    // Given
    Student student =
        Student.builder().id(890L).name("Santiago").lastName("Perez").age((byte) 24).build();

    // When
    Student studentSaved = studentRepository.save(student);

    // Then
    assertNotNull(studentSaved);
    assertEquals("Santiago", studentSaved.getName());
    assertEquals("Perez", studentSaved.getLastName());
    assertEquals(24, studentSaved.getAge());
  }

  @Test
  void testUpdate() {
    Optional<Student> actualStudent = studentRepository.findById(2L);

    assertNotNull(actualStudent);
    assertTrue(actualStudent.isPresent());
    assertEquals("Carolina", actualStudent.orElseThrow().getName());
    assertEquals("González", actualStudent.orElseThrow().getLastName());
    assertEquals(15, actualStudent.orElseThrow().getAge());

    Student studentUpdated = actualStudent.orElseThrow();
    studentUpdated.setName("Jhon");
    studentUpdated.setLastName("Doe");
    studentUpdated.setAge((byte) 30);

    Student studentSaved = studentRepository.save(studentUpdated);

    assertNotNull(studentSaved);
    assertEquals("Jhon", studentSaved.getName());
    assertEquals("Doe", studentSaved.getLastName());
    assertEquals(30, studentSaved.getAge());
  }

  @Test
  void testDelete() {
    Optional<Student> actualStudent = studentRepository.findById(1L);

    assertNotNull(actualStudent);
    assertTrue(actualStudent.isPresent());
    assertEquals("Jorge", actualStudent.orElseThrow().getName());
    assertEquals("Pérez", actualStudent.orElseThrow().getLastName());
    assertEquals(16, actualStudent.orElseThrow().getAge());

    studentRepository.delete(actualStudent.orElseThrow());

    assertEquals(9, studentRepository.findAll().size());
    assertThrows(NoSuchElementException.class, () -> studentRepository.findById(1L).orElseThrow());
  }
}
