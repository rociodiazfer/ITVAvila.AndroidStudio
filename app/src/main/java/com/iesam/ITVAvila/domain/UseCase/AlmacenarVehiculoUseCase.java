package com.iesam.ITVAvila.domain.UseCase;

import com.iesam.ITVAvila.data.VehiculoDataStore;
import com.iesam.ITVAvila.domain.models.Vehiculo;

public class AlmacenarVehiculoUseCase {

    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(Vehiculo modelo) {
        dataStore.guardar(modelo);
    }

}
