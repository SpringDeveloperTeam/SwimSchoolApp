package com.school.app.mapper;

import com.school.app.dto.student.StudentRequestDTO;
import com.school.app.dto.student.StudentResponseDTO;
import com.school.app.model.Invoice;
import com.school.app.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface IStudentMapper {

  /**
   * Map a Student to StudentResponseDTO
   *
   * @param student
   * @return StudentResponseDTO
   */
  @Mapping(source = "id", target = "id")
  @Mapping(source = "name", target = "studentName")
  @Mapping(source = "lastName", target = "studentLastName")
  @Mapping(source = "parent.name", target = "parentName")
  @Mapping(source = "parent.lastName", target = "parentLastName")
  @Mapping(source = "parent.invoiceList", target = "lastPayment", qualifiedByName = "lastPayment")
  StudentResponseDTO toStudentDTO(Student student);

  @Named(value = "lastPayment")
  default LocalDateTime mapLastPayment(List<Invoice> invoiceList) {
    if (invoiceList == null || invoiceList.isEmpty()) return null;
    Invoice latestInvoice =
        Collections.max(invoiceList, Comparator.comparing(Invoice::getDateOfPaid));
    return latestInvoice.getDateOfPaid();
  }

  /**
   * Map a List<Student> to List<StudentResponseDTO>
   *
   * @param student
   * @return List<StudentResponseDTO>
   */
  List<StudentResponseDTO> toStudentsDTO(List<Student> student);

  @Mapping(source = "name", target = "name")
  @Mapping(source = "lastName", target = "lastName")
  @Mapping(source = "age", target = "age")
  Student toStudent(StudentRequestDTO studentRequestDTO);
}
