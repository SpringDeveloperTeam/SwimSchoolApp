package com.school.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
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

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Student> students;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Invoice> invoices;
}
