package edu.faminasbh.ltp2.slides.intro.tipos;

public class Ints {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// Octal
		int octal = 07734; // 4060
		System.out.println(octal);
		
		//Hexadecimal 
		int hexa = 0xA5;  // 165
		System.out.println(hexa);
		
		int xor = hexa ^ octal;
		System.out.println(xor);
		

	}

}
