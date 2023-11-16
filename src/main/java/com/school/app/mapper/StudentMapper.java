package com.school.app.mapper;

import com.school.app.dtos.StudentDTO;
import com.school.app.models.Invoice;
import com.school.app.models.Parent;
import com.school.app.models.Student;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.util.Comparator;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(source = "name", target = "studentName")
    @Mapping(source = "parent.name", target = "parentName")
    @Mapping(source = "parent", target = "lastPayment", qualifiedByName = "lastPaymentDate")
    StudentDTO toStudentDTO(Student student);

    @Named(value= "lastPaymentDate")
    default LocalDateTime getLastPaymentDate(Parent parent) {
        if (parent != null && parent.getInvoiceList() != null) {
            return parent.getInvoiceList().stream()
                    .filter(invoice -> invoice.getDateOfPaid() != null)
                    .max(Comparator.comparing(Invoice::getDateOfPaid))
                    .map(Invoice::getDateOfPaid)
                    .orElse(null);
        }
        return null;
    }
}
