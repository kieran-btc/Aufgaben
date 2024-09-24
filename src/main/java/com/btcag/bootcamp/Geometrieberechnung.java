package com.btcag.bootcamp;

import java.util.Scanner;

public class Geometrieberechnung {
    public static void main(String[] args) {
        Scanner form1 = new Scanner(System.in);
        Scanner scanSeitenlänge1 = new Scanner(System.in);
        Scanner scanSeitenlänge2 = new Scanner(System.in);
        Scanner radius1 = new Scanner(System.in);

        System.out.println("Bitte geben Sie ein, ob sie die Fläche eines Kreises (1) oder eines Rechtecks (2) berechnen möchten: ");
        String form = form1.nextLine();
        while (form .equals("1")) {
            System.out.println("Geben Sie den Radius vom Kreis in cm ein: ");
            double radius = radius1.nextDouble();
            double ErgebnisKreis = ((radius * radius) * 3.14);
            System.out.println("Die Fläche vom Kreis beträgt " + ErgebnisKreis + " cm");
            form = form + 2;
        }
        while (form .equals("2")) {
            System.out.println("Geben Sie die erste Seitenlänge vom Rechteck in cm ein: ");
            double seitenlänge1 = scanSeitenlänge1.nextDouble();
            System.out.println("Geben Sie die zweite Seitenlänge vom Rechteck in cm ein: ");
            double seitenlänge2 = scanSeitenlänge2.nextDouble();
            double ergebnisRechteck = seitenlänge1 * seitenlänge2;
            System.out.println("Die Fläche vom Rechteck beträgt " + ergebnisRechteck + " cm");
            form = form + 1;

        }
        while (form .equals("3")) {
            System.out.println("Verarschen kann ich mich selber!");
            break;
        }
    }
}
