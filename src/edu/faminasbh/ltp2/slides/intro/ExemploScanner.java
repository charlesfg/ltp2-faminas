package edu.faminasbh.ltp2.slides.intro;

import java.util.Scanner;

public class ExemploScanner {
	public static void main( String [] args )   
	{   
		Scanner scan = new Scanner( System.in );   

		System.out.print("Qual seu nome: ");   
		String seuNome = scan.next( );
		System.out.println("Seu nome é: '"+seuNome+"'");
	}  
}
