package com.ucentral.EjercicioVehiculos.controladores;

import com.ucentral.EjercicioVehiculos.persistencia.dtos.VehiculoDTO;
import com.ucentral.EjercicioVehiculos.sevicios.VehiculoServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoControlador {
    VehiculoServicio vehiculoServicio;

    public VehiculoControlador(VehiculoServicio vehiculoServicio) {
        this.vehiculoServicio = vehiculoServicio;
    }

    @PostMapping("/crear")
    public ResponseEntity<VehiculoDTO> crear(@RequestBody VehiculoDTO vehiculoDTO) {
        return ResponseEntity.ok(vehiculoServicio.crearVehiculo(vehiculoDTO));
    }
}
