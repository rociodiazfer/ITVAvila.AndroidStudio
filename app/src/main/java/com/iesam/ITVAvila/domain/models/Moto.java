package com.iesam.ITVAvila.domain.models;

public class Moto implements Vehiculo{
    private String codigo;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String añoM;
    private Double diamR;

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

    public Double getDiamR() {
        return diamR;
    }

    public void setDiamR(Double diamR) {
        this.diamR = diamR;
    }


    public void setCodMoto(String codMoto) {
        this.codigo = codMoto;
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
