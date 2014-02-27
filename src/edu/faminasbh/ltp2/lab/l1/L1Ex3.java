package edu.faminasbh.ltp2.lab.l1;

import java.util.Arrays;

public class L1Ex3 {
	

	public static void main( String args [ ] ){
		// Dado o vetor abaixo, o objetivo do programa é 
		// implementar o método ordena(int[] vetor) abaixo
		// de forma que ao final o vetor seja impresso ordenado
		int [ ] vetor = {20,10,30,50,70,90,60,80,100,40};

		System.out.println(Arrays.toString(vetor));

	}
	
	//O método abaixo tem como contrato 
	public static int[] ordena(int[] vetor){
		
		// você pode alterar o array de retorno, ou seja
		// a ordenação no precisa ocorrer no próprio vetor
		return vetor;
	}

}
