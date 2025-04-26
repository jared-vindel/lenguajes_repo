package com.example.examen.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="tipovehiculo")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoVehiculo {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="idtipovehiculo")
  private int idTipoVehiculo;

  private String descripcion;

  @Column(name="precioxhora")
  private double precioXHora;
  
  @JsonIgnore
  @OneToMany(mappedBy="tipoVehiculo", cascade=CascadeType.ALL)
  private List<Vehiculo> vehiculos;
}
