package com.school.app.dto.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDTO {
  private String name;
  private String lastName;
  private byte age;
  private Long parentId;
  private Long teacherId;
}
