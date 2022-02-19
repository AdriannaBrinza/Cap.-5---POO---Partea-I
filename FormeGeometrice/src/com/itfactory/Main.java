package com.itfactory;

import com.itfactory.DREPTUNGHI.Dreptunghi;
import com.itfactory.PATRAT.Patrat;
import com.itfactory.TRIUNGHI.Triunghi;

public class Main {

    public static void main(String[] args) {
        System.out.println("TRIUNGHI: ");
        Triunghi triunghi = new Triunghi(5, 3, 7);
        System.out.println("Perimetrul triunghiului cu laturile " + triunghi.getLatura1() + ", " + triunghi.getLatura2() + ", " + triunghi.getLatura3() +
                " este: " + triunghi.calculeazaPerimetru());

        System.out.println("---------------------------------------\n" +
                "DREPTUNGHI: ");

        Dreptunghi dreptunghi = new Dreptunghi(8, 15);
        System.out.println("Perimetrul dreptunghiului cu lungimea " + dreptunghi.getLungime() + " si latimea " + dreptunghi.getLatime() +
                " este: " + dreptunghi.calculeazaPerimetru());
        System.out.println("Aria dreptunghiului cu lungimea " + dreptunghi.getLungime() + " si latimea " + dreptunghi.getLatime() +
                " este: " + dreptunghi.calculeazaAria());

        System.out.println("---------------------------------------\n" +
                "PATRAT: ");

        Patrat patrat = new Patrat(5);
        System.out.println("Perimetrul patratului cu latura " + patrat.getLatura() + " este: " + patrat.calculeazaPerimetru());
        System.out.println("Aria patratului cu latura " + patrat.getLatura() + " este: " + patrat.calculeazaAria());
    }
}
