package Exercicios20_02_2014;

public class vetorv {

	public static void main( String[] args ){
		
		int i, aux;
		int[] v;
		v = new int[i];
		
		for(i = 8; i >= 5; i--){
			aux = v[ i ];
			v[ i ] = v[ 8 - i + 1 ];
			v[ 8 - i + 1 ] = aux;
			}
		
			v[3] = v[1];
			v[v[3]] = v[v[2]];
		
	
	}

}


