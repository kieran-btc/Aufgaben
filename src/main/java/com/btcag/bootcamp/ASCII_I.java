package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_I {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        int auswahl;
        int groesse = 0;
        int x = 2;
        int y = 1;

        System.out.println("Möchtest du einen Würfel (1) oder ein Dreieck (2) generieren lassen?");
        auswahl = scan1.nextInt();
        System.out.println("Welche Größe soll das Objekt haben?");
        groesse = scan1.nextInt();

        while (auswahl == 1) {
            while (y <= groesse) {
                while (x <= groesse) {
                    System.out.print("*");
                    x = x + 1;
                }
                x = 1;
                System.out.println("*");
                x = x + 1;
                y = y + 1;

            }
            auswahl = 3;
        }

        while (auswahl == 2) {

        }
    }
}