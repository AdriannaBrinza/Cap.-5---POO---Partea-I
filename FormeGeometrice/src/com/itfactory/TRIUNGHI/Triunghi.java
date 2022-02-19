package com.itfactory.TRIUNGHI;

public class Triunghi {
    private int latura1, latura2, latura3;

    public Triunghi(int latura1, int latura2, int latura3) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public int getLatura1() {
        return latura1;
    }

    public int getLatura2() {
        return latura2;
    }

    public int getLatura3() {
        return latura3;
    }

    public int calculeazaPerimetru() {
        if (Math.abs(latura1 - latura3) < latura2 && latura2 < (latura1 + latura3) && latura1 > 0 && latura2 > 0 && latura3 > 0) {
            return latura1 + latura2 + latura3;
        } else {
            System.out.println("Numerele furnizate nu pot forma un triunghi deoarece nu verifica inegalitatea triunghiului.");
            return 0;
        }
    }
}
