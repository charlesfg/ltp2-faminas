import java.util.Scanner;
public class MaiorValor {

	public static void main(String[] args) {
		int n,max=0,aux;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de N: ");
		n = input.nextInt();
		
		for(int x = 1; x<=n ;x++){
			System.out.print("Digite o valor:");
			aux = input.nextInt();
			if(aux >= max) max=aux;
		}
		System.out.println("O maior valor é: "+max);

	}

}
