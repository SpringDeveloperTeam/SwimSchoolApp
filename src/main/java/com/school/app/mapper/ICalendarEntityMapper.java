package com.school.app.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import com.school.app.dto.calendar.CalendarEntityDTO;
import com.school.app.model.CalendarEntity;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ICalendarEntityMapper {
    CalendarEntityDTO toCalendarEntityResponseDTO(CalendarEntity calendarEntity);
    List<CalendarEntityDTO> toCalendarEntitysDTO(List<CalendarEntity> calendars);
}
