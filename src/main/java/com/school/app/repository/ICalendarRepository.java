package com.school.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.school.app.model.CalendarEntity;

@Repository
public interface ICalendarRepository extends CrudRepository<CalendarEntity, Long> {}
