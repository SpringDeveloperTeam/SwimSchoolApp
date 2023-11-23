package com.school.app.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@Builder
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

    public Student(Long id, String name, String lastName, byte age, Parent parent, Teacher teacher) {
        super(id, name, lastName);
        this.age = age;
        this.parent = parent;
        this.teacher = teacher;
    }

    public Student(Long id, String name, String lastName) {
        super(id, name, lastName);
    }

    public Student() {

    }
}
