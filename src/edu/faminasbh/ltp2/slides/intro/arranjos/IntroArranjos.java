package edu.faminasbh.ltp2.slides.intro.arranjos;

public class IntroArranjos {

	public static void main(String[] args) {
		
		// Declaração do array, tipo e dimensão
		float array[][];
		// criação, tamanho
		array =  new float[100][];
		// System.out.println(array[1].length); // NPE
		array =  new float[100][50];
		System.out.println(array[1].length);
		
		int a []  =  new int [4];
		int b[] [] = {{1,2,3,4},{6,7},{8,9,10,11},{12,13}}; 
		
	}
}
