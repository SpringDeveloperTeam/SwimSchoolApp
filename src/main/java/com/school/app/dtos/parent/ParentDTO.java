package com.school.app.dtos.parent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParentDTO {
    protected String name;
    protected String lastName;
    private String document;
    private String email;
    private String address;
    private Long phone;
}
