package edu.faminasbh.ltp2.exemplos;

import java.util.Scanner;

/*
 * "Ler 3 números inteiros da entrada, imprimir o menor e o maior"
 *  http://www.dsc.ufcg.edu.br/~jacques/cursos/p2/html/intro/intro.htm
 * Autor: Jacques Sauvé
 */

public class MinMax4 {
    public static void main(String[] args) {
        final int NUMEROS_A_LER = 3;
        Scanner sc = new Scanner(System.in);
        int maximo = Integer.MAX_VALUE;
        int minimo = Integer.MIN_VALUE;

        for (int i = 0; i < NUMEROS_A_LER; i++) {
            System.out.print("Entre com o proximo inteiro: ");
            int num = sc.nextInt();
            if (num < minimo) {
               minimo = num;
            }
            if (num > maximo) {
                maximo = num;
            }
        }
        
        System.out.println("O menor numero eh: " + minimo);
        System.out.println("O maior numero eh: " + maximo);
        sc.close();
    }
}