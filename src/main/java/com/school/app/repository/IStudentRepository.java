package com.school.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.school.app.models.Student;

public interface IStudentRepository extends CrudRepository<Student, Long> {
    @Query("SELECT s FROM Student s")
    List<Student> getStudents();
}
