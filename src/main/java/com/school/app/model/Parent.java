package com.school.app.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "acudientes")
public class Parent extends Person {
    @Column(name = "documento", nullable = false)
    private String document;

    @Column(nullable = false)
    private String email;

    @Column(name = "direccion", nullable = false)
    private String address;

    @Column(name = "telefono", nullable = false)
    private Long phone;

    @JsonManagedReference
    @OneToMany(mappedBy = "parent",
            fetch = FetchType.LAZY,
            orphanRemoval = true)
    private List<Student> students;

    @OneToMany(mappedBy = "parent",
            fetch = FetchType.LAZY,
            targetEntity = Invoice.class,
            orphanRemoval = true)
    private List<Invoice> invoiceList;
}


