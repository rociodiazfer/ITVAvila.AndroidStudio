package com.iesam.ITVAvila.domain.UseCase;

import com.iesam.ITVAvila.data.PropietarioDataStore;
import com.iesam.ITVAvila.domain.models.Propietario;

public class ObtenerPropietarioUseCase {

    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public Propietario execute(String codigo){
        return dataStore.buscar(codigo);
    }
}
