package edu.faminasbh.ltp2.slides.intro.comandos;

import java.util.Arrays;

public class ExemploFor {

public static void main(String[] args) {	
//	exemploForComum();
//	exemploForAprimorado();
//	exemploForContinue();
	exemploForContinueLabel();
}

private static void exemploForAprimorado() {
	int s = 0; 
	int a[] = {1,2,3,4,5,6,7,8,9};
	for(int x : a) x = 0;
	System.out.println(Arrays.toString(a));	
}

private static void exemploForComum() {
	int s = 0; 
	int a[] = {0,0,0,0,0,0,3,5,10,1,2,0,4};
	
	for (int i = 0; i < a.length; i++)s+= a[i];
	for(int i = 0, j = a.length -1; i < a.length; i++, j--){
		System.out.println("a["+i+"]+a["+j+"] = "+(a[i]+a[j]));
	}
	
}

private static void exemploForContinue() {
	int s = 0; 
	int a[] = {1,0,0,0,1,1,0,1,0,1,1,1,0,0};
	
	for (int i = 0; i < a.length; i++){
		if(a[i]==0)	continue;
		s++;
	}
	System.out.println("Números diferentes de 0: "+s);	
}

private static void exemploForContinueLabel() {		
	int a[][] = {{0,1,4},{0,6,3},{0,3,0,1},{4,9},{0,1,0},{2,3}};	
	int zeros = 0;
	for_externo:
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if(a[i][j]== 0){
				zeros++;
				continue for_externo;
			}
		}
	}
	System.out.println("Arrays com zeros: "+zeros);		
}

}
