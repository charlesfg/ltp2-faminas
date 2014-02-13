package edu.faminasbh.ltp2.slides.intro.comandos;

public class ExemploDoWhile {
	
	public static void main(String[] args) {
		int []a = {0,0,0,0,0,0,3,5,10,1,2,0,4};
		int b[] = {0,0,0,0,0,0,3,5,10,1,2,0,4};
		int []c[] = {{0,1},{2,3}};
		
		int h = 0;
		
		do h++; while(a[h-1] == 0);
		h--;
		if (h < a.length){
			do {
				System.out.println(a[h]);
				h++;
			} while ( h < a.length);
		}
		
	}

}
