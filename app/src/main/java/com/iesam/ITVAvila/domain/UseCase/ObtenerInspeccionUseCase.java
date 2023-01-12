package com.iesam.ITVAvila.domain.UseCase;

import com.iesam.ITVAvila.data.InspeccionDataStore;
import com.iesam.ITVAvila.domain.models.Inspeccion;

public class ObtenerInspeccionUseCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public Inspeccion execute(String codigo){
        return dataStore.buscar(codigo);
    }
}
