package com.school.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import com.school.app.dto.parent.ParentDTO;
import com.school.app.model.Parent;

@Mapper(componentModel = ComponentModel.SPRING)
public interface IParentMapper {
    ParentDTO toParentDTO(Parent parent);
}
