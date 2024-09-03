/* Escreva um programa que leia 10 valores inteiros, informados pelo usuário e
armazene-os em um vetor. Após isso, lendo o vetor uma única vez e sem criar
outros vetores, mostre na tela a média dos valores armazenados no vetor
ponderados pelos índices nos quais estão armazenados. */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int controlador = 4;
        int[] vetor = new int[controlador];

        Scanner scn = new Scanner(System.in);

        System.out.println("Entre com " + controlador + " valores inteiros: ");
        for(int i = 0; i < vetor.length; i ++) {
            vetor[i] = scn.nextInt();
        }

        float soma = 0;
        float media = 0;

        for(int i = 0; i < vetor.length; i ++) {
            vetor[i] = vetor[i] * i;
            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.println("Média: " + media);

    }
}
