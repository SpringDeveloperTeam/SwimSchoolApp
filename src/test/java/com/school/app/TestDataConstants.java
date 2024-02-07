package com.school.app;

import com.school.app.model.Invoice;
import com.school.app.model.Parent;
import com.school.app.model.Student;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class TestDataConstants {

  /*
    Student Data
   */

  public static final Student STUDENT_ENTITY_DATA() {
    Student student = new Student();
    student.setId(3L);
    student.setName("Santiago");
    student.setLastName("Perez");
    student.setParent(
        Parent.builder()
            .id(4L)
            .name("Alejandra")
            .lastName("Posada")
            .invoiceList(
                List.of(
                    Invoice.builder()
                        .id(1L)
                        .dateOfPaid(LocalDateTime.of(2019, 03, 15, 13, 42, 02))
                        .paidAmount(new BigDecimal(30000))
                        .paidMode("Cash")
                        .build(),
                    Invoice.builder()
                        .id(2L)
                        .dateOfPaid(LocalDateTime.of(2020, 11, 14, 9, 10, 13))
                        .paidAmount(new BigDecimal(25000))
                        .paidMode("Transfer")
                        .build()))
            .build());
    return student;
  }

  public static final List<Student> STUDENT_ENTITY_DATA_LIST() {
    Student student = new Student();
    student.setId(2L);
    student.setName("Santiago");
    student.setLastName("Perez");
    student.setParent(
        Parent.builder()
            .id(4L)
            .name("Alejandra")
            .lastName("Posada")
            .invoiceList(
                List.of(
                    Invoice.builder()
                        .id(1L)
                        .dateOfPaid(LocalDateTime.of(2019, 03, 15, 13, 42, 02))
                        .paidAmount(new BigDecimal(30000))
                        .paidMode("Cash")
                        .build(),
                    Invoice.builder()
                        .id(2L)
                        .dateOfPaid(LocalDateTime.of(2020, 11, 14, 9, 10, 13))
                        .paidAmount(new BigDecimal(25000))
                        .paidMode("Transfer")
                        .build()))
            .build());

    Student student2 = new Student();
    student2.setId(6L);
    student2.setName("Jhon");
    student2.setLastName("Serna");
    student2.setParent(
        Parent.builder()
            .id(9L)
            .name("Gloria")
            .lastName("Cordoba")
            .invoiceList(
                List.of(
                    Invoice.builder()
                        .id(2L)
                        .dateOfPaid(LocalDateTime.of(2013, 01, 26, 13, 42, 02))
                        .paidAmount(new BigDecimal(45000))
                        .paidMode("Cash")
                        .build(),
                    Invoice.builder()
                        .id(5L)
                        .dateOfPaid(LocalDateTime.of(2016, 03, 14, 9, 10, 13))
                        .paidAmount(new BigDecimal(55000))
                        .paidMode("Transfer")
                        .build()))
            .build());

    return List.of(student, student2);
  }

  public static final List<Invoice> INVOICES_DATA_LIST() {
    return List.of(
        Invoice.builder()
            .id(1L)
            .dateOfPaid(LocalDateTime.of(2019, 03, 15, 13, 42, 02))
            .paidAmount(new BigDecimal(30000))
            .paidMode("Cash")
            .build(),
        Invoice.builder()
            .id(2L)
            .dateOfPaid(LocalDateTime.of(2020, 11, 14, 9, 10, 13))
            .paidAmount(new BigDecimal(25000))
            .paidMode("Transfer")
            .build());
  }

  /*
    Parent Data
   */

  public static final Parent PARENT_ENTITY_DATA() {
    Parent parent = new Parent();
    parent.setId(3L);
    parent.setName("Adriana");
    parent.setLastName("Florez");
    parent.setDocument("1003245834");
    parent.setEmail("test@test.com");
    parent.setAddress("Avenida carrera 14 #49-55");
    parent.setPhone(739398L);
    parent.setStudents(STUDENT_ENTITY_DATA_LIST());
    parent.setInvoiceList(INVOICES_DATA_LIST());
    return parent;
  }
}
