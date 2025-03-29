package com.ucentral.EjercicioVehiculos.persistencia.dtos;

import com.ucentral.EjercicioVehiculos.persistencia.entidades.Vehiculo;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoDTO {

    private String placa;
    private String marca;
    private String modelo;
    private String tipo;
    private LocalDate fechaLanzamiento;

}
