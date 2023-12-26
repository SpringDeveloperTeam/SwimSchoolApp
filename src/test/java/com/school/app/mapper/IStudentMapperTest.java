package com.school.app.mapper;

import com.school.app.TestDataConstants;
import com.school.app.dto.student.StudentResponseDTO;
import com.school.app.model.Invoice;
import com.school.app.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IStudentMapperTest {

  @Autowired private IStudentMapper studentMapper;

  @Test
  void testStudentToStudentResponseDTO() {

    Student student = TestDataConstants.STUDENT_ENTITY_DATA();
    StudentResponseDTO dto = studentMapper.toStudentDTO(student);

    assertNotNull(dto);
    assertEquals(3L, dto.getId());
    assertEquals("Santiago", dto.getStudentName());
    assertEquals("Perez", dto.getStudentLastName());
    assertEquals("Alejandra", dto.getParentName());
    assertEquals("Posada", dto.getParentLastName());
    assertEquals(LocalDateTime.of(2020, 11, 14, 9, 10, 13), dto.getLastPayment());
  }

  @Test
  void testStudentsToStudentsResponseDTO() {
    List<Student> studentList = TestDataConstants.STUDENT_ENTITY_DATA_LIST();
    List<StudentResponseDTO> dto = studentMapper.toStudentsDTO(studentList);

    assertFalse(dto.isEmpty());
    assertNotNull(dto);

    assertEquals(2, dto.size());
    assertEquals(2L, dto.get(0).getId());
    assertEquals("Santiago", dto.get(0).getStudentName());
    assertEquals("Perez", dto.get(0).getStudentLastName());
    assertEquals("Alejandra", dto.get(0).getParentName());
    assertEquals("Posada", dto.get(0).getParentLastName());
    assertEquals(LocalDateTime.of(2020, 11, 14, 9, 10, 13), dto.get(0).getLastPayment());

    assertEquals(6L, dto.get(1).getId());
    assertEquals("Jhon", dto.get(1).getStudentName());
    assertEquals("Serna", dto.get(1).getStudentLastName());
    assertEquals("Gloria", dto.get(1).getParentName());
    assertEquals("Cordoba", dto.get(1).getParentLastName());
    assertEquals(LocalDateTime.of(2016, 03, 14, 9, 10, 13), dto.get(1).getLastPayment());
  }

  @Test
  void mapLastPymentTest() {
    List<Invoice> invoiceList = TestDataConstants.INVOICES_DATA_LIST();
    LocalDateTime localDateTime = studentMapper.mapLastPayment(invoiceList);

    assertNotNull(localDateTime);
    assertEquals(LocalDateTime.of(2020, 11, 14, 9, 10, 13), localDateTime);
  }
}
