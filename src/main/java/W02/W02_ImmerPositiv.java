package W02;
import java.util.Scanner;

public class W02_ImmerPositiv {
    public static void main(String[] args) {

        int ganzzahl;
        int pos_zahl;
        Scanner scan = new Scanner(System.in);

        System.out.print("Ganzzahl eingeben: ");
        ganzzahl = scan.nextInt();

        if (ganzzahl < 0) {
            pos_zahl = ganzzahl * (-1);
        } else {
            pos_zahl = ganzzahl;
        }

        System.out.print("Die zugehörige positive Zahl lautet: " + pos_zahl);

    }
}
