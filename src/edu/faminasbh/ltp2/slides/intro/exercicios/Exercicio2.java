package edu.faminasbh.ltp2.slides.intro.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int first = sc.nextInt();
		int second = 0;
		do{
			second = sc.nextInt();
		}while(second == 0);		
		System.out.println(first / second);
	}
}
