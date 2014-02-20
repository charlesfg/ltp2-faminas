package edu.faminasbh.ltp2.slides.intro.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int F = 1, Fmenos1 = 0;

		if(n == 1){
			System.out.println(1);
		}else{
			for(int i = 1; i < n; i++){
				F = F + Fmenos1; // F_n = F_n-1 + F_n-2
				Fmenos1 =  F - Fmenos1;// F_n-2 = F_n-1 
			}
		}
		System.out.println(F);
	}

}
