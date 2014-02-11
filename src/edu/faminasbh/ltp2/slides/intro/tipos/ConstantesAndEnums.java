package edu.faminasbh.ltp2.slides.intro.tipos;

public class ConstantesAndEnums {	
	class CircleConst{
		public static final double PI = 3.14;
	}	
	
	class Naipe {
		final static int PAUS = 1;	final static int ESPADAS = 2;
		final static int COPAS = 3;	final static int OUROS = 4;
	}
	
	enum EnumNaipe {
		PAUS, ESPADAS, OUROS, COPAS;
	}

	public static void main(String[] args) {
		int sete  = Naipe.OUROS;
		EnumNaipe quatro = EnumNaipe.PAUS;
		
		double raio = 2.34E-2;
		double area = CircleConst.PI * raio * raio;
	}
}
