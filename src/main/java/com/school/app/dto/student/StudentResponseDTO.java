package com.school.app.dto.student;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponseDTO {
  private Long id;
  private String studentName;
  private String studentLastName;
  private String parentName;
  private String parentLastName;
  private LocalDateTime lastPayment;
}
