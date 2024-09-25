package W02;

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

        int[] intArray2 = {5, 7, 2, 9, 1, 8};

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
