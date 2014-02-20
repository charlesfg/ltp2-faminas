package edu.faminasbh.ltp2.slides.classes;

import java.util.Scanner;

public class ExClasse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Fibonacci f =  new Fibonacci();
		int n = sc.nextInt();
		System.out.println(f.fib(n));
	}

}
