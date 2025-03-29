package com.ucentral.EjercicioVehiculos.persistencia.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name="placa", unique = true)
    private String placa;

    @Column(name="marca")
    private String marca;

    @Column(name="modelo")
    private String modelo;

    @Column(name="tipo")
    private String tipo;

    @Column(name="fecha_lanzamiento")
    private LocalDate fechaLanzamiento;

}
