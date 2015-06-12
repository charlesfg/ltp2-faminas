//Referente: Slide II - Introdução Java - Exercício 4

package ltp2.faminasbh.java;
import java.util.Scanner;

public class Sequencial {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x = 0,
			y=1,
			aux = 3,
			proximo = 1;
			
		
		do{
			System.out.print("Entre com o N-ésimo número:");
			x = sc.nextInt();	
		} while(x>=20);
		
//=========================================================Processamento da Sequencia==========
			
			if(x==1)
			{
				System.out.print("1");
				y=x;
				y++;
			}//Fim se (Caso o usuario digite 1, ele imprime "1" e pula o laço for)
		
			else
			{	
				System.out.print("1");//Imprime "1" e escreve oresto do laço
				
				for(y = y; y < x; y++)//Escreve o resto da sequencia.
				{
					proximo = proximo + aux; //4,9,
					aux = aux + 2;//5,7 
					System.out.print(" "+proximo);
				}
			}
	}
}
