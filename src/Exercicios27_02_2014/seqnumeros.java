package Exercicios20_02_2014;

import java.util.Scanner;

public class seqnumeros {	
		
		public static void main( String[] args ){
		
		Scanner lernum = new Scanner(System.in);
		
		int y ;
		int w;
		int x = 2;
		
		System.out.printf( "Digite um número: \n");
		y = lernum.nextInt();
		
		while ( x < 19 ) 
		  {
		     w = y * x * x; 
		    System.out.println( w );   
		     ++x;                        
		  }
		
		     
		 
		}
	}

