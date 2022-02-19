package com.itfactory;

import com.itfactory.componente.CutieDeViteze;
import com.itfactory.componente.Motor;

public class Reparatie {
    private String marcaProductie;
    private double costReparatie;
    private Motor motor;
    private CutieDeViteze cutieDeViteze;

    public Reparatie(String marcaProductie, double costReparatie, Motor motor, CutieDeViteze cutieDeViteze) {
        this.marcaProductie = marcaProductie;
        this.costReparatie = costReparatie;
        this.motor = motor;
        this.cutieDeViteze = cutieDeViteze;
    }

    public String getMarcaProductie() {
        return marcaProductie;
    }

    public double getCostReparatie() {
        return costReparatie;
    }

    public Motor getMotor() {
        return motor;
    }

    public CutieDeViteze getCutieDeViteze() {
        return cutieDeViteze;
    }

    public boolean verificaMarcaProductieMotor() {
        return marcaProductie.equals(motor.getMarcaProductie());
    }

    public boolean verificaMarcaProductieCutieViteze() {
        return marcaProductie.equals(cutieDeViteze.getMarcaProductie());
    }

    public double calculeazaPretReparatie() {
        if (verificaMarcaProductieMotor() && verificaMarcaProductieCutieViteze()) {
            if (cutieDeViteze.isAutomata()) {
                return (costReparatie + motor.getPretVanzare() + cutieDeViteze.getPretVanzare() + 2150.75);
            } else {
                return (costReparatie + motor.getPretVanzare() + cutieDeViteze.getPretVanzare());
            }
        } else {
            System.out.println("Costul de productie nu poate fi stabilit.\n" +
                    "Componente gresite");
        }
        return 0;
    }
}
