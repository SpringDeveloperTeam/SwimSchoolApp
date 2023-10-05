package com.school.app.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity(name = "Parent")
@Table(name = "ACUDIENTES")
public class Parent extends Person {
    @Column(name = "documento", nullable = false)
    private String document;

    @Column(nullable = false)
    private String email;

    @Column(name = "direccion", nullable = false)
    private String address;

    @Column(name = "telefono", nullable = false)
    private Long phone;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, targetEntity = Student.class)
    private List<Student> students;
}
