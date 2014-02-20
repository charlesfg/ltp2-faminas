package edu.faminasbh.ltp2.slides.intro.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < n ; i++) {
			System.out.print((i*i) + ",");
		}
		System.out.println(n*n);

	}

}
