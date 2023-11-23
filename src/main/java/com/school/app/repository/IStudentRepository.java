package com.school.app.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import com.school.app.model.Student;

@Repository
public interface IStudentRepository extends ListCrudRepository<Student, Long> {}
