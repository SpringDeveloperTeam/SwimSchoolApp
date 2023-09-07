package com.school.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ALUMNOS")
public class Student extends Person {
    @Column(name = "edad", nullable = false)
    private byte age;

    @ManyToOne
    @JoinColumn(name = "id_acudiente")
    private Parent parent;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Teacher teacher;
}
