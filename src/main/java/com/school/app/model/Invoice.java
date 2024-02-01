package com.school.app.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
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