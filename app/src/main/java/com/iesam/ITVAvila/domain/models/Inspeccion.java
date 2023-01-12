package com.iesam.ITVAvila.domain.models;
public class Inspeccion {
    public String codigo;
    private String fechaInspeccion;
    private boolean resultado;
    private Vehiculo vehiculo;
    private Propietario propietario;

    public String getCodigo (String codigo){
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo= codigo;
    }

    public String getFechaInspeccion(String s) {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(String fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setResultado(Boolean resultado){
        this.resultado= resultado;
    }

    public boolean getResultado() {
        return resultado;
    }
}
