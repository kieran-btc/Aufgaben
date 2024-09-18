package com.btcag.bootcamp;
import java.util.Scanner;

public class rueckwaertsausgabe {
    public static void main(String[] args) {

        String Ergebnis = "";

        Scanner Zahl = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int zahl = Zahl.nextInt();

        Ergebnis = (zahl + Ergebnis);

        System.out.println("Ihre Zahl lautet rueckwaerts: " + Ergebnis);
    }
}
