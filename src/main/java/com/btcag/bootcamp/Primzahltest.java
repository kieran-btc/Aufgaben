package com.btcag.bootcamp;

import java.util.Scanner;

public class Primzahltest {
    public static void main(String[] args) {

        System.out.println("Welche Zahl möchtest du auf eine Primzahl testen?");
        Scanner scan = new Scanner(System.in);
        long primzahl = scan.nextLong();
        long zahl = 2;
        boolean isPrimzahl = true;

        while (zahl < primzahl) {
            while (primzahl % zahl == 0) {
                isPrimzahl = false;
                zahl++;
            }
            zahl++;
        }
        while (isPrimzahl) {
            System.out.println("Es handelt sich um eine Primzahl");
            break;
        }
        while (!isPrimzahl) {
            System.out.println("Es handelt sich um keine Primzahl");
            break;
        }
    }
}

