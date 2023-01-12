package com.iesam.ITVAvila.domain.models;

public class Coche implements Vehiculo{
    private String codigo;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String añoM;
    private Integer numPuertas;


    public void setCodCoche(String codCoche) {
        this.codigo = codCoche;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAñoM(String añoM) {
        this.añoM = añoM;
    }

    public Integer getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(Integer numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }
}
