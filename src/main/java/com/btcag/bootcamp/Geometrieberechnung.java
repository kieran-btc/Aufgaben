package com.btcag.bootcamp;

import java.util.Scanner;

public class Geometrieberechnung {
    public static void main(String[] args) {
        Scanner Form = new Scanner(System.in);
        Scanner Seitenlänge1 = new Scanner(System.in);
        Scanner Seitenlänge2 = new Scanner(System.in);
        Scanner Radius = new Scanner(System.in);

        System.out.println("Bitte geben Sie ein, ob sie die Fläche eines Kreises (1) oder eines Rechtecks (2) berechnen möchten: ");
        String form = Form.nextLine();
        while (form .equals("1")) {
            System.out.println("Geben Sie den Radius vom Kreis in cm ein: ");
            double radius = Radius.nextDouble();
            double ErgebnisKreis = ((radius * radius) * 3.14);
            System.out.println("Die Fläche vom Kreis beträgt " + ErgebnisKreis + " cm");
            form = form + 2;
        }
        while (form .equals("2")) {
            System.out.println("Geben Sie die erste Seitenlänge vom Rechteck in cm ein: ");
            double seitenlänge1 = Seitenlänge1.nextDouble();
            System.out.println("Geben Sie die zweite Seitenlänge vom Rechteck in cm ein: ");
            double seitenlänge2 = Seitenlänge2.nextDouble();
            double ErgebnisRechteck = seitenlänge1 * seitenlänge2;
            System.out.println("Die Fläche vom Rechteck beträgt " + ErgebnisRechteck + " cm");
            form = form + 1;

        }
        while (form .equals("3")) {
            System.out.println("Verarschen kann ich mich selber!");
            break;
        }
    }
}
