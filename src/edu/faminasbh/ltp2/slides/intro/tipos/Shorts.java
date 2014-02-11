package edu.faminasbh.ltp2.slides.intro.tipos;

public class Shorts {

	public static void main(String[] args) {
		int x = 1;
		short b1 = 1, b2 = 2;
//		short b3 = b1 + b2; // Errado (cannot convert from int to short)
		short b4 = (short) (b1 + b2); // Correto  
//		short b5 = x;
		short b6 = (short) x;
		 
	}

}
