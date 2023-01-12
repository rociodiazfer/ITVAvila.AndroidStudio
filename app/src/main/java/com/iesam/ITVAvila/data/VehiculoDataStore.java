package com.iesam.ITVAvila.data;

import com.iesam.ITVAvila.domain.models.Vehiculo;

import java.util.Map;
import java.util.TreeMap;

public class VehiculoDataStore {

    private static VehiculoDataStore instance = null;

    private Map<String, Vehiculo> dataStore = new TreeMap<>();

    public void guardar(Vehiculo model) {dataStore.put(model.getCodigo(), model);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);
    }

    public Vehiculo buscar(String codigo) {
        return dataStore.get(codigo);
    }

    public void modificar(Vehiculo model) {
        dataStore.put(model.getCodigo(), model);
    }

    public static VehiculoDataStore getInstance() {
        if (instance == null) {
            instance = new VehiculoDataStore();
        }
        return instance;
    }
}
