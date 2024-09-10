/* Leia um valor e faça um programa que coloque o valor lido na primeira posição
de um vetor de 10 posições. Em cada posição subsequente, coloque o dobro do
valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor
devem ser 1, 2, 4, 8 e assim sucessivamente. Mostre o vetor em seguida. */

import org.w3c.dom.Node;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int contador = 10;
        int[] vetor = new int[contador];

        System.out.print("Entre com um valor inteiro: ");
        int valor = scn.nextInt();

        for(int i = 0; i < vetor.length; i++) {
            if(i == 0) {
                vetor[i] = valor;
            } else {
                vetor[i] = (vetor[i - 1]) * 2;
            }
        }

        System.out.println("Vetor Final: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}
