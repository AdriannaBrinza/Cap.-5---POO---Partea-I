package com.itfactory.DREPTUNGHI;

public class Dreptunghi {
    private int lungime, latime;

    public Dreptunghi(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    public int calculeazaPerimetru() {
        return lungime * 2 + latime * 2;
    }

    public int calculeazaAria() {
        return lungime * latime;
    }
}
