package demo;

import java.util.Random;

public class main {
    public static void main(String[] args) {

    int[][] tabla = new int[5][5];
    boolean[] usado = new boolean[26];

    Random random = new Random();

    for (int i = 0; i < tabla.length; i++) {
        for (int j = 0; j < tabla[i].length; j++) {
            if (i == 2 && j == 2) {
                tabla[i][j] = 0;
                continue;
            }
    int numero;

        do {
        numero = random.nextInt(25) + 1;
        } while (usado[numero]);

        usado[numero] = true;
        tabla[i][j] = numero;
        }
    }

    int numeroSorteado = random.nextInt(25) + 1;


    for (int i = 0; i < tabla.length; i++) {
        for (int j = 0; j < tabla[i].length; j++){
            if (tabla[i][j] == numeroSorteado) {
            tabla[i][j] = -1;
            }
        }
    }

    System.out.println("Welcome to Bingo!\n");
    System.out.println("Player 1 - Drawn Number: " + numeroSorteado + "\n");
    System.out.println("Player 1's Card:\n");

    for (int i = 0; i < tabla.length; i++) {
        for (int j = 0; j < tabla[i].length; j++) {
            if ((i == 2 && j == 2) || tabla[i][j] == -1) {
                    System.out.print("X\t");
                } else {
                    System.out.print(tabla[i][j] + "\t");
                }
            }

            System.out.println();
        }
    }

}
