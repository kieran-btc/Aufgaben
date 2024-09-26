package W02;
import java.util.Scanner;

public class W02_Sortieren {

    public static void sortieren(int[] intArray1) {
        int n = intArray1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intArray1[j] > intArray1[j + 1]) {
                    int temp = intArray1[j];
                    intArray1[j] = intArray1[j + 1];
                    intArray1[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wie viele Zahlen möchtest du sortieren?: ");
        int n = scan.nextInt();

        int[] intArray2 = new int[n];
        System.out.println("Welche " + n + " Zahlen möchtest du sortieren?");
        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = scan.nextInt();
        }

        System.out.println("Der Array vor der Sortierung lautet: ");
        for (int t = 0; t < intArray2.length; t++) {
            System.out.print(intArray2[t] + " ");
        }

        sortieren(intArray2);

        System.out.println("\nDer Array nach der Sortierung lautet: ");
        for (int t = 0; t < intArray2.length; t++) {
            System.out.print(intArray2[t] + " ");
        }
    }
}
