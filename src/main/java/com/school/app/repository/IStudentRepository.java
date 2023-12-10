package com.school.app.repository;

import com.school.app.model.Student;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends ListCrudRepository<Student, Long> {}
