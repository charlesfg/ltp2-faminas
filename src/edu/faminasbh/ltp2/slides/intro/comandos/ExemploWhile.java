package edu.faminasbh.ltp2.slides.intro.comandos;

public class ExemploWhile {
	
	public static void main(String[] args) {
		exemploWhile();
		exemploWhileBreak();
	}

	private static void exemploWhile() {
		int []a = {0,0,0,0,0,0,3,5,10,1,2,0,4};
		int b[] = {0,0,0,0,0,0,3,5,10,1,2,0,4};
		int []c[] = {{0,1},{2,3}};
		
		int h = 0;
		
		while(a[h] == 0) h++;
		
		while ( h < a.length){
			System.out.println(a[h]);
			h++;
		}
		
	}
	
private static void exemploWhileBreak() {		
	int []a = {0,0,2,0,0,0,3,-5,10,1,2,0,4};
	int i = 0;		
	while(i<a.length){
		if(a[i]< 0)	break;
		System.out.println(a[i]);i++;
	}				
}


}
