package com.school.app.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alumnos")
@EqualsAndHashCode(callSuper=false)
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
