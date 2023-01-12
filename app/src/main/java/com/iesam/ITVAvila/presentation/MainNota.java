package com.iesam.ITVAvila.presentation;

import com.iesam.ITVAvila.domain.UseCase.AlmacenarInspeccionUseCase;
import com.iesam.ITVAvila.domain.UseCase.AlmacenarPropietarioUseCase;
import com.iesam.ITVAvila.domain.UseCase.AlmacenarVehiculoUseCase;
import com.iesam.ITVAvila.domain.UseCase.ObtenerInspeccionUseCase;
import com.iesam.ITVAvila.domain.UseCase.ObtenerPropietarioUseCase;
import com.iesam.ITVAvila.domain.UseCase.ObtenerVehiculoUseCase;
import com.iesam.ITVAvila.domain.models.Camion;
import com.iesam.ITVAvila.domain.models.Coche;
import com.iesam.ITVAvila.domain.models.Inspeccion;
import com.iesam.ITVAvila.domain.models.Moto;
import com.iesam.ITVAvila.domain.models.Propietario;

public class MainNota {


    public void main(){

        Propietario propietario = new Propietario();
        propietario.setDni("76542290");
        propietario.setAdress("Ávila");
        propietario.setName("Mario");
        propietario.setSurname("Sánchez");
        propietario.setPhone("654328905");
        propietario.setProvince("Ávila");
        propietario.setPopulation("Las Navas Del Marqués");

        AlmacenarPropietarioUseCase almacenarPropietarioUseCase = new AlmacenarPropietarioUseCase();
        almacenarPropietarioUseCase.execute(propietario);
        ObtenerPropietarioUseCase obtenerPropietarioUseCase = new ObtenerPropietarioUseCase();

        Camion camion = new Camion();
        camion.setCodCamion("2");
        camion.setMarca("Mercedes");
        camion.setColor("Blanco");
        camion.setMatricula("562 463 889-H");
        camion.setModelo("Benz");
        camion.setTara(2);
        camion.setLongitud(118);
        camion.setAñoM("2019");

        AlmacenarVehiculoUseCase almacenarVehiculoUseCase = new AlmacenarVehiculoUseCase();
        almacenarVehiculoUseCase.execute(camion);

        Coche coche = new Coche();
        coche.setCodCoche("3");
        coche.setColor("Negro");
        coche.setMarca("BMW");
        coche.setMatricula("673 892 021-LBB");
        coche.setAñoM("2019");
        coche.setModelo("X6");
        coche.setNumPuertas(4);

        Moto moto = new Moto();
        moto.setCodMoto("7");
        moto.setAñoM("2019");
        moto.setColor("Naranja");
        moto.setModelo("duke");
        moto.setMarca("KTM");
        moto.setDiamR(54.3);

        almacenarVehiculoUseCase.execute(coche);
        ObtenerVehiculoUseCase obtenerVehiculoUseCase = new ObtenerVehiculoUseCase();

        Inspeccion inspeccion = new Inspeccion();
        inspeccion.setCodigo("77");
        inspeccion.setFechaInspeccion("22-4-22");
        inspeccion.setResultado(false);
        inspeccion.setPropietario(obtenerPropietarioUseCase.execute("76542290"));
        inspeccion.setVehiculo(obtenerVehiculoUseCase.execute("3"));

        ObtenerInspeccionUseCase obtenerInspeccionUseCase = new ObtenerInspeccionUseCase();
        AlmacenarInspeccionUseCase almacenarInspeccionUseCase = new AlmacenarInspeccionUseCase();
        almacenarInspeccionUseCase.execute(inspeccion);

        Inspeccion inspeccion1 = new Inspeccion();
        inspeccion1.setCodigo("23");
        inspeccion1.setResultado(true);
        inspeccion1.setFechaInspeccion("12-06-22");
        inspeccion1.setVehiculo(obtenerVehiculoUseCase.execute("7"));
        inspeccion1.setPropietario(obtenerPropietarioUseCase.execute("76542290"));

        almacenarInspeccionUseCase.execute(inspeccion1);


        PrintInspeccion printInspeccion = new PrintInspeccion();

        printInspeccion.imprimir(obtenerInspeccionUseCase.execute("77"));
        printInspeccion.imprimir(obtenerInspeccionUseCase.execute("23"));






    }

}
