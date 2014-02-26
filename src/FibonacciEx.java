import java.util.Scanner;
public class FibonacciEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y=1,prox=1,ant=0,aux;
		
		do{
		System.out.print("Digite um Inteiro menor que 20:");
		x = input.nextInt();
		}while(x>=20);
		
		if(x==1){
			System.out.print("1");
			y=x;
		}
		else{
			System.out.print("1");
			
			for(y=y;y<x;y++){
			aux = prox;
			prox = prox+ant;
			ant = aux;
			System.out.print(" "+prox);
							}
		}
	}

}
