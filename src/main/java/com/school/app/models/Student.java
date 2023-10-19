package com.school.app.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
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
