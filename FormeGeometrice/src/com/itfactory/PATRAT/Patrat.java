package com.itfactory.PATRAT;

public class Patrat {
    private int latura;

    public Patrat(int latura) {
        this.latura = latura;
    }

    public int getLatura() {
        return latura;
    }

    public int calculeazaPerimetru() {
        return 4 * latura;
    }

    public int calculeazaAria() {
        return latura * latura;
    }
}
