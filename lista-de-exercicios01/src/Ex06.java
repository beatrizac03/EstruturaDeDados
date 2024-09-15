/* Crie uma matriz bidimensional quadrada para armazenar 9 valores inteiros
informados pelo usuário. Depois, calcule e mostre na tela o determinante da
matriz. */

import java.util.Scanner;

public class Ex06 {

    public static int calcularDeterminante(int[][] matriz) {
        return matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
    }

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        Scanner scn = new Scanner(System.in);
        System.out.println("Entre com 9 valores inteiros: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.printf("Posição [%d][%d]: ", i, j);
                matriz[i][j] = scn.nextInt();
            }
        }

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(Ex06.calcularDeterminante(matriz));

    }
}
