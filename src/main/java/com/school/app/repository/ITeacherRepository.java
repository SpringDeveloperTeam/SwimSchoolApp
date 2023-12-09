package com.school.app.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import com.school.app.model.Teacher;

@Repository
public interface ITeacherRepository extends ListCrudRepository<Teacher, Long> {
    
}
