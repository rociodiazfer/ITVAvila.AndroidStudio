package com.iesam.ITVAvila.domain.UseCase;

import com.iesam.ITVAvila.data.VehiculoDataStore;
import com.iesam.ITVAvila.domain.models.Vehiculo;

public class ObtenerVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public Vehiculo execute(String codigo){
        return dataStore.buscar(codigo);
    }
}
