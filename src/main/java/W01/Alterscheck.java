package W01;
import java.util.Scanner;

public class Alterscheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib das zu überprüfende Alter ein: ");
        int alter = sc.nextInt();
        if (alter >= 18) {
            System.out.println("Volljährig");
        }
        else if (alter < 0) {
            System.out.println("Ungültig");
        }
        else {
            System.out.println("Minderjährig");
        }
    }
}
