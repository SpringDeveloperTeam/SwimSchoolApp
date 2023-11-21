package com.school.app.mapper;

import com.school.app.dtos.StudentDTO;
import com.school.app.models.Invoice;
import com.school.app.models.Student;
import java.time.LocalDateTime;
import java.util.List;
import org.mapstruct.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentMapper {
    public static final Logger LOG = LoggerFactory.getLogger(StudentMapper.class);

    @Mapping(source = "name", target = "studentName")
    @Mapping(source = "parent.name", target = "parentName")
    @Mapping(source = "parent.invoiceList", target = "lastPayment", qualifiedByName = "lastPayment")
    StudentDTO toStudentDTO(Student student);

    @Named("lastPayment")
    default LocalDateTime mapLastPayment(List<Invoice> invoiceList) {
        if (invoiceList == null || invoiceList.isEmpty()) return null;

        invoiceList.sort((inv1, inv2) -> inv2.getDateOfPaid().compareTo(inv1.getDateOfPaid()));
        
        return invoiceList.get(0).getDateOfPaid();
    }

    Iterable<StudentDTO> toStudentsDTO(Iterable<Student> students);
}
