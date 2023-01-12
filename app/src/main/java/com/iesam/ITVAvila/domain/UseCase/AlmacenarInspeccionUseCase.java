package com.iesam.ITVAvila.domain.UseCase;

import com.iesam.ITVAvila.data.InspeccionDataStore;
import com.iesam.ITVAvila.domain.models.Inspeccion;

public class AlmacenarInspeccionUseCase {

    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public void execute(Inspeccion modelo) {
        dataStore.guardar(modelo);
    }
}
