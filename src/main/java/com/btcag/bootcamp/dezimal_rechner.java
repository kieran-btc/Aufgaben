package com.btcag.bootcamp;

import java.util.Scanner;

public class dezimal_rechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine positive ganze Zahl ein: ");
        int dezimal = scanner.nextInt();
        String result = "";

        while (dezimal > 0) {
            int resultModulo = dezimal % 2;
            result = resultModulo + result;
            dezimal /= 2;
        }

        System.out.println("Das Ergebnis lautet: " + result);
    }
}
