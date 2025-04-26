package com.example.examen.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="idreserva")
  private int idReserva;

  private LocalDate fecha;

  private int dias;

  private double total;

  

}
