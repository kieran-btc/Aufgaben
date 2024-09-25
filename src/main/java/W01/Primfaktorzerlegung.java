package W01;

import java.util.Scanner;

public class Primfaktorzerlegung {

    // Methode zur Berechnung der Primfaktoren
    public static void primfaktorenZerlegung(int zahl) {
        // Faktor 2: Alle geraden Faktoren entfernen
        while (zahl % 2 == 0) {
            System.out.print(2 + " ");
            zahl /= 2;
        }

        // Faktoren ab 3: nur ungerade Zahlen prüfen
        for (int i = 3; i <= Math.sqrt(zahl); i += 2) {
            while (zahl % i == 0) {
                System.out.print(i + " ");
                zahl /= i;
            }
        }

        // Wenn die verbleibende Zahl > 2 ist, ist sie selbst ein Primfaktor
        if (zahl > 2) {
            System.out.print(zahl);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe einer beliebigen Zahl
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();

        System.out.print("Die Primfaktoren von " + zahl + " sind: ");
        primfaktorenZerlegung(zahl);

        scanner.close();
    }
}
