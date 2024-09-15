/* Escreva um programa que receba um enúmero intiro 2 ≤ 𝑁 ≤ 5, crie uma
matriz quadrada 𝑁 × 𝑁, preencha a matriz com valores de 1 até 𝑁2, calcule o
quadrado da matriz criada e exiba o resultado na tela. */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int valor = 3;
        do {
            System.out.println("Entre com um valor 2 <= N <=5: ");
            valor = scn.nextInt();
            if (valor < 2 || valor > 5) {
                System.out.println("O valor precisa estar entre 2 e 5");
            }
        } while (valor < 2 || valor > 5);

        int[][] matriz = new int[valor][valor];
        int contador = 1;

        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                matriz[i][j] = contador++;
            }
        }

        System.out.println("Matriz criada: ");
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println("");
        }

        int[][] matrizQuadrado = new int[valor][valor];

        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                matrizQuadrado[i][j] = 0;
                for (int k = 0; k < valor; k++) {
                    matrizQuadrado[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        System.out.println("");
        System.out.println("Quadrado da matriz: ");
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                System.out.print(matrizQuadrado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
