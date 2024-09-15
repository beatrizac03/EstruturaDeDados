/* Escreva um programa que calcule a multiplicação entre duas matrizes quaisquer.
Seu programa deve determinar se é possível executar a multiplicação, e mostrar
o resultado do cálculo para os casos possíveis. Quando não for possível efetuar a
operação, uma mensagem deve ser exibida na tela.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        int[] ordemMatrizA = new int[2];
        int[] ordemMatrizB = new int[2];

        System.out.println(" MULTIPLICAÇÃO DE MATRIZES ");

        do {
            System.out.println("");
            System.out.println("Qual será a ordem da matriz A? Digite quantidade de linhas e colunas, respectivamente: ");
            ordemMatrizA[0] = scn.nextInt();
            ordemMatrizA[1] = scn.nextInt();

            System.out.println("Qual será a ordem da matriz B? Digite quantidade de linhas e colunas, respectivamente: ");
            ordemMatrizB[0] = scn.nextInt();
            ordemMatrizB[1] = scn.nextInt();

            if(ordemMatrizA[1] != ordemMatrizB[0]) {
                System.out.println(" Para efetuar a multiplicação, a qtde de colunas da MatrizA PRECISA ser IGUAL à qtde linhas da MatrizB!");
            }

        } while(ordemMatrizA[1] != ordemMatrizB[0]);

        int[][] matrizA = new int[ordemMatrizA[0]][ordemMatrizA[1]];
        int[][] matrizB = new int[ordemMatrizB[0]][ordemMatrizB[1]];
        int[][] matrizResultado = new int[ordemMatrizA[0]][ordemMatrizB[1]];

        for (int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[0].length; j++) {
                matrizA[i][j] = random.nextInt(15);
            }
        }

        for (int i = 0; i < matrizB.length; i++) {
            for(int j = 0; j < matrizB[0].length; j++) {
                matrizB[i][j] = random.nextInt(15);
            }
        }

        System.out.println("MATRIZ A");
        for (int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[0].length; j++) {
                System.out.print(matrizA[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("MATRIZ B");
        for (int i = 0; i < matrizB.length; i++) {
            for(int j = 0; j < matrizB[0].length; j++) {
                System.out.print(matrizB[i][j] + "  ");
            }
            System.out.println("");
        }

        for (int i = 0; i < ordemMatrizA[0]; i++) {
            for (int j = 0; j < ordemMatrizB[1]; j++) {
                for (int k = 0; k < ordemMatrizA[1]; k++) {
                    matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("");
        System.out.println("MATRIZ RESULTADO (A x B):");
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[0].length; j++) {
                System.out.print(matrizResultado[i][j] + "  ");
            }
            System.out.println("");
        }

    }
}
