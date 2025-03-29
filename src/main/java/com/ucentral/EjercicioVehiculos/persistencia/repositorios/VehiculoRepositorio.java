package com.ucentral.EjercicioVehiculos.persistencia.repositorios;

import com.ucentral.EjercicioVehiculos.persistencia.dtos.VehiculoDTO;
import com.ucentral.EjercicioVehiculos.persistencia.entidades.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {
}
