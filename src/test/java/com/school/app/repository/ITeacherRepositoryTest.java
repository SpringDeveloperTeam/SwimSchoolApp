package com.school.app.repository;

import com.school.app.model.Parent;
import com.school.app.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ITeacherRepositoryTest {

  @Autowired ITeacherRepository teacherRepository;

  @Test
  void testFindById() {
    Optional<Teacher> teacherOptional = teacherRepository.findById(5L);

    assertNotNull(teacherOptional);
    assertTrue(teacherOptional.isPresent());
    assertEquals("Laura", teacherOptional.orElseThrow().getName());
    assertEquals("García", teacherOptional.orElseThrow().getLastName());
  }

  @Test
  void testFindByIdError() {
    Optional<Teacher> teacherOptional = teacherRepository.findById(100L);

    assertFalse(teacherOptional.isPresent());
    assertTrue(teacherOptional.isEmpty());
    assertNotNull(teacherOptional);
  }
}
