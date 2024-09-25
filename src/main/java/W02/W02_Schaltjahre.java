package W02;

import java.util.Scanner;

public class W02_Schaltjahre {
    public static void main(String[] args) {

        int jahreszahl;
        int x;
        boolean bool = true;

        System.out.println("Gib die zu prüfende Jahreszahl ein: ");
        Scanner sc = new Scanner(System.in);
        jahreszahl = sc.nextInt();

        x = jahreszahl % 2;

        if (jahreszahl % 2 == 0) {
            bool = true;
            if (jahreszahl % 100 == 0 && jahreszahl % 400 != 0) {
                bool = false;
            }
        } else {
            bool = false;
        }

        if (bool) {
            System.out.println(jahreszahl + " ist ein Schaltjahr.");
        } else {
            System.out.println(jahreszahl + " ist kein Schaltjahr.");
        }

    }
}
