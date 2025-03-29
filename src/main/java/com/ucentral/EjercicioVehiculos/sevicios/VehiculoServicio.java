package com.ucentral.EjercicioVehiculos.sevicios;

import com.ucentral.EjercicioVehiculos.persistencia.dtos.VehiculoDTO;
import com.ucentral.EjercicioVehiculos.persistencia.entidades.Vehiculo;
import com.ucentral.EjercicioVehiculos.persistencia.repositorios.VehiculoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServicio {
    private final VehiculoRepositorio vehiculoRepositorio;

    public VehiculoServicio(VehiculoRepositorio vehiculoRepositorio) {
        this.vehiculoRepositorio = vehiculoRepositorio;
    }

    public VehiculoDTO crearVehiculo (VehiculoDTO vehiculoDTO) {
        Vehiculo vehiculo = Vehiculo.builder()
                .placa(vehiculoDTO.getPlaca())
                .marca(vehiculoDTO.getMarca())
                .modelo(vehiculoDTO.getModelo())
                .tipo(vehiculoDTO.getTipo())
                .fechaLanzamiento(vehiculoDTO.getFechaLanzamiento())    
                .build();

        vehiculoRepositorio.save(vehiculo);

        return vehiculoDTO;
    }

}
