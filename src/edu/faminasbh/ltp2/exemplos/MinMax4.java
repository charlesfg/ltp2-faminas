package edu.faminasbh.ltp2.exemplos;

import java.util.Scanner;


public class MinMax4 {
    public static void main(String[] args) {
        final int NÚMEROS_A_LER = 3;
        Scanner sc = new Scanner(System.in);
        int mínimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < NÚMEROS_A_LER; i++) {
            System.out.print("Entre com o proximo inteiro: ");
            int num = sc.nextInt();
            if (num < mínimo) {
                mínimo = num;
            }
            if (num > maximo) {
                maximo = num;
            }
        }
        
        System.out.println("O menor numero eh: " + mínimo);
        System.out.println("O maior numero eh: " + maximo);
        sc.close();
    }
}