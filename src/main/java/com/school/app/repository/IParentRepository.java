package com.school.app.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import com.school.app.model.Parent;

@Repository
public interface IParentRepository extends ListCrudRepository<Parent, Long> {
    
}
