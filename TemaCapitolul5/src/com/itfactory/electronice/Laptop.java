package com.itfactory.electronice;


import com.itfactory.componente.MemorieSSD;
import com.itfactory.componente.Ram;

public class Laptop {
    private String marca;
    private String culoare;
    private double dimensiuneEcran;
    private Ram ram;
    private MemorieSSD memorieSSD;

    public Laptop(String marca, String culoare, double dimensiuneEcran, Ram ram, MemorieSSD memorieSSD) {
        this.marca = marca;
        this.culoare = culoare;
        this.dimensiuneEcran = dimensiuneEcran;
        this.ram = ram;
        this.memorieSSD = memorieSSD;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getDimensiuneEcran() {
        return dimensiuneEcran;
    }

    public Ram getRam() {
        return ram;
    }

    public MemorieSSD getMemorieSSD() {
        return memorieSSD;
    }

    //Setters:
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setDimensiuneEcran(double dimensiuneEcran) {
        this.dimensiuneEcran = dimensiuneEcran;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setMemorieSSD(MemorieSSD memorieSSD) {
        this.memorieSSD = memorieSSD;
    }
}
