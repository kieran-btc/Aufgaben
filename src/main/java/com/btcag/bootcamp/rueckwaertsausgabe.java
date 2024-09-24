package com.btcag.bootcamp;
import java.util.Scanner;

public class rueckwaertsausgabe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte Zahl eingeben (String):");
        String zahl1 = scan.nextLine();
        String ergebnis1 = new StringBuilder(zahl1).reverse().toString();
        System.out.println("Ihre Zahl lautet rückwärts: " + ergebnis1);

        System.out.println("Bitte Zahl eingeben (Long):");
        long zahl2 = scan.nextLong();
        String zahl3 = Long.toString(zahl2);
        String ergebnis2 = new StringBuilder(zahl3).reverse().toString();
        System.out.println("Ihre Zahl lautet rückwärts: " + ergebnis2);
    }
}
