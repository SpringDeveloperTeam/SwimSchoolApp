package com.school.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "facturas")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monto_pagado", nullable = false)
    private BigDecimal paidAmount;

    @Column(name = "modo_pago", nullable = false)
    private String paidMode;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDateTime dateOfPaid;

    @ManyToOne
    @JoinColumn(name = "id_acudiente")
    private Parent parent;
}
