package com.school.app.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
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
    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Student> students;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, targetEntity = Invoice.class)
    private List<Invoice> invoiceList;
}
