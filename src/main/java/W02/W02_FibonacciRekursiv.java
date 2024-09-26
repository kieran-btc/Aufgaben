package W02;

import java.util.Scanner;

public class W02_FibonacciRekursiv {
    public static int fibonacci(int n, int ergebnis, int zahl1, int zahl2) {

        int p;
        if (ergebnis < n) {
            ergebnis = zahl2 + zahl1;
            zahl1 = zahl2;
            zahl2 = ergebnis;
            p = ergebnis;
            if (p <= n) {
                System.out.print(ergebnis + " ");
                p = n + 1;
            }
            return fibonacci(n, ergebnis, zahl1, zahl2);
        } else {
            return ergebnis;
        }
    }

    public static void main(String[] args) {
        System.out.println("Bis zu welcher Zahl möchtest du die Fibonacci-Reihe ausgeben?");
        Scanner sc = new Scanner(System.in);
        int zahl1 = 0;
        int zahl2 = 1;
        int ergebnis = 0;
        int n = sc.nextInt();
        System.out.println("Die Fibonacci-Reihe bis " + n + " lautet:");
        System.out.print("0 1 ");
        fibonacci(n, ergebnis, zahl1, zahl2);
    }
}