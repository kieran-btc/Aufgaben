package W02;

import java.util.Scanner;

public class W02_TicTacToe {
    public static int board(int x, int y, int player, String[][] spielfeld, int c, Scanner sc) {
        while (spielfeld[y][x].equals("[X]") || spielfeld[y][x].equals("[O]")) {
            System.out.println("Position ungültig. Bitte erneut eingeben: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        if (player == 1) {
            spielfeld[y][x] = "[X]";
        } else {
            spielfeld[y][x] = "[O]";
        }
        for (int i = 0; i < spielfeld.length; i++) {
            for (int i1 = 0; i1 < spielfeld.length; i1++) {
                System.out.print(spielfeld[i][i1]);
            }
            System.out.println();
        }
        if (spielfeld[0][0].equals("[X]") && spielfeld[0][1].equals("[X]") && spielfeld[0][2].equals("[X]")) {
            c++;
        }
        if (spielfeld[1][0].equals("[X]") && spielfeld[1][1].equals("[X]") && spielfeld[1][2].equals("[X]")) {
            c++;
        }
        if (spielfeld[2][0].equals("[X]") && spielfeld[2][1].equals("[X]") && spielfeld[2][2].equals("[X]")) {
            c++;
        }
        if (spielfeld[0][0].equals("[X]") && spielfeld[1][0].equals("[X]") && spielfeld[2][0].equals("[X]")) {
            c++;
        }
        if (spielfeld[0][1].equals("[X]") && spielfeld[1][1].equals("[X]") && spielfeld[2][1].equals("[X]")) {
            c++;
        }
        if (spielfeld[0][2].equals("[X]") && spielfeld[1][2].equals("[X]") && spielfeld[2][2].equals("[X]")) {
            c++;
        }
        if (spielfeld[0][0].equals("[X]") && spielfeld[1][1].equals("[X]") && spielfeld[2][2].equals("[X]")) {
            c++;
        }
        if (spielfeld[0][2].equals("[X]") && spielfeld[1][1].equals("[X]") && spielfeld[2][0].equals("[X]")) {
            c++;
        }
        if (spielfeld[0][0].equals("[O]") && spielfeld[0][1].equals("[O]") && spielfeld[0][2].equals("[O]")) {
            c++;
        }
        if (spielfeld[1][0].equals("[O]") && spielfeld[1][1].equals("[O]") && spielfeld[1][2].equals("[O]")) {
            c++;
        }
        if (spielfeld[2][0].equals("[O]") && spielfeld[2][1].equals("[O]") && spielfeld[2][2].equals("[O]")) {
            c++;
        }
        if (spielfeld[0][0].equals("[O]") && spielfeld[1][0].equals("[O]") && spielfeld[2][0].equals("[O]")) {
            c++;
        }
        if (spielfeld[0][1].equals("[O]") && spielfeld[1][1].equals("[O]") && spielfeld[2][1].equals("[O]")) {
            c++;
        }
        if (spielfeld[0][2].equals("[O]") && spielfeld[1][2].equals("[O]") && spielfeld[2][2].equals("[O]")) {
            c++;
        }
        if (spielfeld[0][0].equals("[O]") && spielfeld[1][1].equals("[O]") && spielfeld[2][2].equals("[O]")) {
            c++;
        }
        if (spielfeld[0][2].equals("[O]") && spielfeld[1][1].equals("[O]") && spielfeld[2][0].equals("[O]")) {
            c++;
        }
        ;
        return c;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int player = 1;
        int c = 0;
        String[][] spielfeld = {
                {"[ ]", "[ ]", "[ ]"},
                {"[ ]", "[ ]", "[ ]"},
                {"[ ]", "[ ]", "[ ]"}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Willkommen bei TicTacToe!");
        for (int i = 0; i < spielfeld.length; i++) {
            for (int i1 = 0; i1 < spielfeld.length; i1++) {
                System.out.print(spielfeld[i][i1]);
            }
            System.out.println();
        }
        for (int t = 0; t < 9; t++) {
            System.out.println("Spieler " + player + " ist an der Reihe. Wo möchtest du markieren? Gib zuerst die X-Koordinate und dann die Y-Koordinate ein:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            c = board(x, y, player, spielfeld, c, sc);
            if (player == 1) {
                player = 2;
            } else {
                player = 1;
            }
            if (c == 1) {
                t = 10;
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
                System.out.println("Spieler " + player + " hat das Spiel gewonnen!");
            }
            if (t == 8) {
                t = 10;
                System.out.println("Unentschieden!");
            }
        }
    }
}