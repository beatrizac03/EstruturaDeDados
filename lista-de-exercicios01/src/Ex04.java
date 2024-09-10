/* Leia um valor X. Coloque este valor na primeira posição de um vetor N de 100
posições. Em cada posição subsequente de N (1 até 99), coloque a metade do
valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o
vetor N. */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int contador = 10;
        double[] vetor = new double[contador];

        System.out.print("Entre com um valor inteiro: ");
        double valor = scn.nextDouble();
        vetor[0] = valor;

        for(int i = 1; i < contador; i++) {
            vetor[i] = (vetor[i - 1]) / 2;
        }

        System.out.println("Vetor Final: ");
        for(int i = 0; i < contador; i++) {
            System.out.println(vetor[i]);
        }

    }
}
