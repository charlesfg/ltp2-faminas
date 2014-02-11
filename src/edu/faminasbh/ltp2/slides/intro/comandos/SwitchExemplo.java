package edu.faminasbh.ltp2.slides.intro.comandos;

public class SwitchExemplo {
	
	public static void main(String[] args) {
		switchSemDefault(25);
		line();
		switchComDefault(25);
		line();
		switchComDefault(10);
		line();
		exSlide();
	}
	
	private static void line(){
		for (int i = 0; i < 70; i++) {
			System.out.print("-");			
		}
		System.out.println();
	}
	
	private static void switchSemDefault(int i){		
		switch (i) {
		case 10:
			System.out.println(10);
			return;
		case 20:
			System.out.println(20);
			return;
		case 30:
			System.out.println(30);
			return;
		}
		System.out.println("Passou pelo switch!");
	}
	
	private static void switchComDefault(int i){		
		switch (i) {
		case 10:			
		case 20:			
		case 30:
			System.out.println(i);
			return;
		default:
			System.out.println(i + " não encontrado!");
			return;
		}		
	}
	
	private static void exSlide(){
		String s = "Um string com numeros 12312";
		int numOfDigits = 0 ,  numOfLetters = 0;
		
		for(int i= 0; i<s.length();++i){

			switch(s.charAt(i)){
			case '0': case '1':case '2':case '3':case '4':
			case '5': case '6':case '7':case '8':case '9':
				numOfDigits++;
				break;

			default: numOfLetters++;
			}
		}
		System.out.println(numOfDigits + " , " +numOfLetters);
	}

}
