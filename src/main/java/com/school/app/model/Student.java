package com.school.app.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alumnos")
public class Student extends Person {

  @Column(name = "edad", nullable = false)
  private byte age;

  @ManyToOne
  @JsonBackReference
  @JoinColumn(name = "id_acudiente")
  private Parent parent;

  @ManyToOne
  @JsonBackReference
  @JoinColumn(name = "id_profesor")
  private Teacher teacher;
}
