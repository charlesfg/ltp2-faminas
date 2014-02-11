package edu.faminasbh.ltp2.slides.intro.comandos;

public class IfExemplo {
	public static void main(String[] args) {
		String s = "Um string com numeros 12312";
		int numOfDigits = 0 ,  numOfLetters = 0;
		for(int i= 0; i<s.length();++i){
			char c = s.charAt(i);
			if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'
					||c=='6'||c=='7'||c=='8'||c=='9'){
				numOfDigits++;
			}else numOfLetters++;
		}
		System.out.println(numOfDigits + " , " +numOfLetters);
	}
}
