import java.util.Scanner;
public class DivisaoDoisValores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.print("Digite o primeiro valor: ");
		x = input.nextInt();
		
		do{
			System.out.print("Digite o segundo valor diferente de zero: ");
			y = input.nextInt();
		} while(y==0);
		x = x/y;
		System.out.print("Razão de X e Y é:"+x);
		
	}

}
