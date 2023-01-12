package com.iesam.ITVAvila.data;
import com.iesam.ITVAvila.domain.models.Propietario;

import java.util.Map;
import java.util.TreeMap;

public class PropietarioDataStore {

    private static PropietarioDataStore instance = null;

    private Map<String, Propietario> dataStore = new TreeMap<>();

    public void guardar(Propietario model) {
            dataStore.put(model.getDni(), model);
        }

        public void eliminar(String codigo) {
            dataStore.remove(codigo);
        }

        public Propietario buscar(String codigo) {
            return dataStore.get(codigo);
        }

        public void modificar(Propietario model) {
            dataStore.put(model.getDni(), model);
        }

        public static PropietarioDataStore getInstance() {
            if (instance == null) {
                instance = new PropietarioDataStore();
            }
            return instance;
        }
}
