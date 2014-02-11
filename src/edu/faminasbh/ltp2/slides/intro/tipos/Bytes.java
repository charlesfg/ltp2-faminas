package edu.faminasbh.ltp2.slides.intro.tipos;

public class Bytes {

	public static void main(String[] args) {
		int x = 1;
		byte b1 = 1, b2 = 2;
//		byte b3 = b1 + b2; // Errado (cannot convert from int to byte)
		byte b4 = (byte) (b1 + b2); // Correto
		byte b5 = (byte) (512 + 3); // b5 = 3 ; 2 bytes 
//		byte b6 = x;
		byte b7 = (byte) x;
	}

}
