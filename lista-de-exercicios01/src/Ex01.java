/* Escreva um programa que crie um vetor de números inteiros, receba 10 valores
informados pelo usuário, imprima todos os valores pares e depois todos os
valores ímpares. */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int controlador = 10;
        int[] vetor = new int[controlador];

        int[] pares = new int[controlador];
        int[] impares = new int[controlador];

        Scanner scn = new Scanner(System.in);

        System.out.println("Entre com " + controlador + " valores: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = scn.nextInt();
        }

        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0 ) {
                pares[i] = vetor[i];
            } else {
                impares[i] = vetor[i];
            }
        }

        System.out.println("Números pares: ");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.print(pares[i] + "  ");
            }
        }
        System.out.println("");

        System.out.println("Números ímpares: ");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 != 0) {
                System.out.print(impares[i] + "  ");
            }
        }


    }
}
