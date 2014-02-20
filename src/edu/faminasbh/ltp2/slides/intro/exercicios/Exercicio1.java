package edu.faminasbh.ltp2.slides.intro.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int NUM = sc.nextInt();
		int max = 0;
		for (int i = 0; i < NUM; i++) {
			int next =  sc.nextInt();
			if(next > max){
				max = next;
			}
		}
		System.out.println(max);

	}
}
