import java.util.Scanner;
public class Sequencia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int prox=0,atual=1,aux=3;
		int y = 0;
		
		System.out.print("Entre com o valor de N:");
		int x = input.nextInt();
		
		if(x==1){
		System.out.print("1");	
		y=x;	
		}
		else{
			x--;
			System.out.println("1");	
			
			for(y=y;y<x;y++){
				atual=aux+atual;
				aux = aux + 2;
				System.out.println(atual);
			}
		}

	}

}
