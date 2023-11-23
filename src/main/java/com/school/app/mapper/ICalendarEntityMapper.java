package com.school.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import com.school.app.dto.calendar.CalendarEntityDTO;
import com.school.app.model.CalendarEntity;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ICalendarEntityMapper {
    CalendarEntityDTO toCalendarEntityResponseDTO(CalendarEntity calendarEntity);

    Iterable<CalendarEntityDTO> toCalendarEntitysDTO(Iterable<CalendarEntity> calendars);
}
