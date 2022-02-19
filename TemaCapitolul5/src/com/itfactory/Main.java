package com.itfactory;

import com.itfactory.componente.MemorieSSD;
import com.itfactory.componente.Ram;
import com.itfactory.electronice.Laptop;

public class Main {

    public static void main(String[] args) {

        Laptop laptop = new Laptop("HP", "negru", 15.6, new Ram("DDR3", "GB", 16), new MemorieSSD(256, "GB"));

        System.out.println("Detalii laptop: \n" +
                "Marca laptop:      " + laptop.getMarca() + "\n" +
                "Culoare laptop:    " + laptop.getCuloare() + "\n" +
                "Dimensiune ecran:  " + laptop.getDimensiuneEcran() + "\n" +
                "----------------------\n" +
                "Memorie RAM: \n" +
                "Tip memorie:        " + laptop.getRam().getTipMemorie() + "\n" +
                "Unitate de masura:  " + laptop.getRam().getUnitateMasura() + "\n" +
                "Capacitate memorie: " + laptop.getRam().getCapacitateMemorie() + "\n" +
                "----------------------\n" +
                "Spatiu de stocare: \n" +
                "Capacitate de stocare SSD:     " + laptop.getMemorieSSD().getCapacitateStocare() + "\n" +
                "Unitate de masura stocare SSD: " + laptop.getMemorieSSD().getUnitateMasura());

    }
}
