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
@Table(name = "HISTORIAL_PAGOS")
public class HistoryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monto_pagado", nullable = false)
    private BigDecimal paidAmount;

    @Column(name = "modo_pago", nullable = false)
    private String paidMode;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDate dateOfPaid;

    @Column(name = "id_estudiante", nullable = false)
    private Long idStudent;
}
