package com.itfactory.util;

import com.itfactory.Reparatie;
import com.itfactory.componente.CutieDeViteze;
import com.itfactory.componente.Motor;

import java.util.Scanner;

public class Utils {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static Motor citesteMotor() {
        System.out.print("Introduceti marca de productie a motorului: ");
        String marcaProductie = scanner.nextLine();
        System.out.print("Introduceti capacitatea motorului: ");
        int capacitateMotor = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduceti pretul motorului: ");
        double pretVanzareMotor = Double.parseDouble(scanner.nextLine());
        return new Motor(marcaProductie, capacitateMotor, pretVanzareMotor);
    }

    public static CutieDeViteze citesteCutieViteze() {
        System.out.print("Introduceti marca de productie a cutiei de viteze: ");
        String marcaProductie = scanner.nextLine();
        System.out.print("Introduceti pretul cutiei de viteze: ");
        double pretVanzareCutieViteze = Double.parseDouble(scanner.nextLine());
        System.out.print("Cutia de viteze este automata? Daca da, introduceti \"true\", iar daca nu este, atunci introduceti \"false\": ");
        boolean automata = Boolean.parseBoolean(scanner.nextLine());
        return new CutieDeViteze(marcaProductie, pretVanzareCutieViteze, automata);
    }

    public static Reparatie citesteDetaliiReparatieAuto() {
        System.out.print("Introduceti marca de productie autoturismului: ");
        String marcaProductie = scanner.nextLine();
        System.out.print("Introduceti costul reparatiei: ");
        double costReparatie = Double.parseDouble(scanner.nextLine());
        System.out.println("----------");
        Motor motor = citesteMotor();
        System.out.println("----------");
        CutieDeViteze cutieDeViteze = citesteCutieViteze();
        System.out.println("----------");
        return new Reparatie(marcaProductie, costReparatie, motor, cutieDeViteze);
    }
}
