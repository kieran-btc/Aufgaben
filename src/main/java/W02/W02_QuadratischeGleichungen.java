package W02;

import java.util.Scanner;

public class W02_QuadratischeGleichungen {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        int x;
        double d;

        System.out.println("Es soll berechnet werden, wie viele Nullstellen die quadratische Funktion f(x) = ax² + bx + c hat.");

        Scanner scan = new Scanner(System.in);
        System.out.println("Gib einen Wert für a ein: ");
        a = scan.nextInt();
        System.out.println("Gib einen Wert für b ein: ");
        b = scan.nextInt();
        System.out.println("Gib einen Wert für c ein: ");
        c = scan.nextInt();

        d = (b * b) - (4 * a * c);

        if (d < 0) {
            x = 0;
        } else if (d == 0) {
            x = 1;
        } else {
            x = 2;
        }

        System.out.println("Die Funktion besitzt mit den eingebenen Werten " + x + " Nullstellen.");
    }
}
