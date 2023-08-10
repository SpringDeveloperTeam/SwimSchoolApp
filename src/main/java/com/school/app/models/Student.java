package com.school.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ALUMNOS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String name;

    @Column(name = "apellido", nullable = false)
    private String lastName;

    @Column(name = "edad", nullable = false)
    private byte age;

    @ManyToOne
    @JoinColumn(name = "id_acudiente")
    private Parent parent;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Teacher teacher;
}
