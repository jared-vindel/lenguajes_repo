package com.example.examen.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "vehiculo")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="idvehiculo")
  private int idVehiculo;

  private String marca;

  private int anio;

  private boolean disponible;

  @ManyToOne
  @JoinColumn(name="idtipovehiculo", referencedColumnName="idtipovehiculo")
  private TipoVehiculo tipoVehiculo;
}
