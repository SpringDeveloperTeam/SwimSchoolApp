package com.school.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FACTURAS")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monto_pagado", nullable = false)
    private BigDecimal paidAmount;

    @Column(name = "modo_pago", nullable = false)
    private String paidMode;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDate dateOfPaid;

    @ManyToOne
    @JoinColumn(name = "id_acudiente")
    private Parent parent;
}
