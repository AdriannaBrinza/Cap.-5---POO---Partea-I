package com.itfactory;

import com.itfactory.util.Utils;

public class Main {

    public static void main(String[] args) {
        Reparatie reparatie1 = Utils.citesteDetaliiReparatieAuto();
        System.out.println("Costul de reparatie final este: " + reparatie1.calculeazaPretReparatie());
    }
}