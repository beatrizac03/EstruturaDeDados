/* Faça um programa que leia um valor e apresente o número de Fibonacci
correspondente a este valor lido. Lembre-sem caber em
um inteiro de 64 bits sem sinal.  que os 2 primeiros elementos da
        série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a
        ele. Todos os valores de Fibonacci calculados neste problema deve */

import java.util.Scanner;

public class Ex05 {
    public static int calcularFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro: ");
        int valor = scn.nextInt();

        int resultado = calcularFibonacci(valor);
        System.out.println("O número de Fibonacci correspondente é: " + resultado);
    }

}
