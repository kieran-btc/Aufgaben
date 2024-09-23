package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Bis zu welcher Zahl möchtest du die Fibonacci-Reihe ausgeben?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ergebnis1 = 0;
        int ergebnis2;
        int zahl1 = 0;
        int zahl2 = 1;
        int p;

        System.out.println("Die Fibonacci-Reihe bis " + n + " lautet:");

        System.out.print("0 ");
        while (ergebnis1 < n) {
            ergebnis1 = zahl2 + zahl1;
            zahl1 = zahl2;
            zahl2 = ergebnis1;
            p = ergebnis1;
            while (p <= n) {
                System.out.print(ergebnis1 + " ");
                p = n + 1;
            }
        }

    }
}
