/* Leia um valor X. Coloque este valor na primeira posição de um vetor N de 100
posições. Em cada posição subsequente de N (1 até 99), coloque a metade do
valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o
vetor N. */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int contador = 10;
        int[] vetor = new int[contador];

        System.out.print("Entre com um valor inteiro: ");
        int valor = scn.nextInt();
    }
}
