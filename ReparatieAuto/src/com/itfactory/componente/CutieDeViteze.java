package com.itfactory.componente;

import java.util.Objects;

public class CutieDeViteze {
    private String marcaProductie;
    private double pretVanzare;
    private boolean automata;

    public CutieDeViteze(String marcaProductie, double pretVanzare, boolean automata) {
        this.marcaProductie = marcaProductie;
        this.pretVanzare = pretVanzare;
        this.automata = automata;
    }

    public String getMarcaProductie() {
        return marcaProductie;
    }

    public double getPretVanzare() {
        return pretVanzare;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "CutieDeViteze{" +
                "marcaProductie='" + marcaProductie + '\'' +
                ", pretVanzare=" + pretVanzare +
                ", automata=" + automata +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CutieDeViteze that = (CutieDeViteze) o;
        return Double.compare(that.pretVanzare, pretVanzare) == 0 && automata == that.automata && Objects.equals(marcaProductie, that.marcaProductie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marcaProductie, pretVanzare, automata);
    }
}
