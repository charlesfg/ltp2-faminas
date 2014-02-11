package edu.faminasbh.ltp2.slides.intro.tipos;

public class Longs {
	
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		// Octal
		long octal = 07734; // 4060
		System.out.println(octal);
		
		//Hexadecimal 
		long hexa = 0xA5;  // 165
		System.out.println(hexa);
		
		long bit_and = hexa & octal;
		System.out.println(bit_and);
		System.out.println(Long.toBinaryString(hexa));
		System.out.println(Long.toBinaryString(octal));
		System.out.println(Long.toBinaryString(bit_and));

	}
}
