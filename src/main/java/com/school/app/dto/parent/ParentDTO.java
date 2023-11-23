package com.school.app.dto.parent;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParentDTO {
    private Long id;
    private String name;
    private String lastName;
    private String document;
    private String email;
    private String address;
    private Long phone;
}
