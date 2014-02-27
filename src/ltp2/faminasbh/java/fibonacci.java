package ltp2.faminasbh.java;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0,
		    atual = 1,
		    anterior = 0,
		    proximo;
		    
		
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("Informe um número inteiro menor que 20: ");
			numero = sc.nextInt();
			
		} while(numero >= 20);
		
		for (int i =0; i <= numero; i++)
		{
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			
			System.out.print(" , " + proximo);
		}

	}

}