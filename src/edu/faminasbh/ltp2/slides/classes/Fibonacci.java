package edu.faminasbh.ltp2.slides.classes;

public class Fibonacci {
	private int f1 = 1;
	
	public int fib(int n){
		if(n <= 1){
			return f1;
		}else{
			return fib(n-1)+fib(n-2);
		}
	}
}
