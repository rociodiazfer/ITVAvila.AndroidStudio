package com.iesam.ITVAvila.domain.UseCase;

import com.iesam.ITVAvila.data.PropietarioDataStore;
import com.iesam.ITVAvila.domain.models.Propietario;

public class AlmacenarPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public void execute(Propietario modelo) {
        dataStore.guardar(modelo);
    }
}
