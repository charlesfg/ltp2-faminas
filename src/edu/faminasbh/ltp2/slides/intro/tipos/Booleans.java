package edu.faminasbh.ltp2.slides.intro.tipos;

public class Booleans {

	public static void main(String[] args) {		

		boolean b , b1 = true, b2 = false , b3 = true;
		
		b = ! (b1 && b2 || b3) & ( b1 | b2);
		
		System.out.println(b);

	}

}
