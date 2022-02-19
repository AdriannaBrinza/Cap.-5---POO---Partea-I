package com.itfactory.componente;

import java.util.Objects;

public class Motor {
    private String marcaProductie;
    private int capacitateMotor;
    private double pretVanzare;

    public Motor(String marcaProductie, int capacitateMotor, double pretVanzare) {
        this.marcaProductie = marcaProductie;
        this.capacitateMotor = capacitateMotor;
        this.pretVanzare = pretVanzare;
    }

    public String getMarcaProductie() {
        return marcaProductie;
    }

    public int getCapacitateMotor() {
        return capacitateMotor;
    }

    public double getPretVanzare() {
        return pretVanzare;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "marcaProductie='" + marcaProductie + '\'' +
                ", capacitateMotor=" + capacitateMotor +
                ", pretVanzare=" + pretVanzare +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return capacitateMotor == motor.capacitateMotor && Double.compare(motor.pretVanzare, pretVanzare) == 0 && Objects.equals(marcaProductie, motor.marcaProductie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marcaProductie, capacitateMotor, pretVanzare);
    }
}
