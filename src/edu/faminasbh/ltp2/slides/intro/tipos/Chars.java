package edu.faminasbh.ltp2.slides.intro.tipos;

public class Chars {

	public static void main(String[] args) {
		char x = 'A';  int y;
		System.out.println("print(x)\t= " + x);		
		System.out.println("print(y=x)\t= " + (y = x));
		System.out.println("print(++x)\t= " + ++x);
		System.out.println("print(y=x)\t= " + (y = x));
		System.out.println("print(x)\t= " + x);
		//Imprime a representacao unicode do char
		System.out.println( "\\u" + Integer.toHexString(x | 0x10000).substring(1) );		
	}
}
