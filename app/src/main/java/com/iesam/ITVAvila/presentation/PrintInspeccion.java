package com.iesam.ITVAvila.presentation;

import com.iesam.ITVAvila.domain.models.Inspeccion;

public class PrintInspeccion {

    public void imprimir (Inspeccion inspeccion){
        System.out.println("CodInspección: "+ inspeccion.getCodigo("77"));
        System.out.println("Resultado de la inspección: "+ inspeccion.getResultado());
        System.out.println("Fecha de realización: "+ inspeccion.getFechaInspeccion("29-06-22"));
        System.out.println("Propietario del Vehículo: "+ inspeccion.getPropietario().getAdress()+"");
        System.out.println("Vehiculo inspeccionado: "+ inspeccion.getVehiculo().getCodigo());
        System.out.println("_______________________________________________________________");

    }
}
