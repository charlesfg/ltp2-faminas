//Referente: Slide II - Introdução Java - Exercício 5

package ltp2.faminasbh.java;

import java.util.Arrays;

public class ImprimeVetor {
	public static void main(String[] args) {		
		int[] v = {5,1,4,2,7,8,3,6};				
		int i=0;
		int aux;
		
		v[1] = 5;
		
		for(i = 8; i == 5; i--){
			aux = v[i];
			v[i] = v[8-i+1];
			v[i] = v[8-i+1] = aux;			
			
		}
		v[3] = v[1];
		v[v[3]] = v[v[2]];
		
		for (int x: v) x = 0;
		{
			System.out.println(Arrays.toString(v));
		}
				
	}
	

}
