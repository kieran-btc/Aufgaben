package W01;
import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Welchen Divisor willst du prüfen?");
        int divisor = scan1.nextInt();

        System.out.println("Welche Zahl ist die Grenze?");
        int grenze = scan1.nextInt();

        int ergebnis = 0;
        while (ergebnis <= grenze) {
            while (ergebnis % divisor == 0) {
                System.out.println(ergebnis);
                break;
            }
            ergebnis = ergebnis + 1;
        }
    }
}
