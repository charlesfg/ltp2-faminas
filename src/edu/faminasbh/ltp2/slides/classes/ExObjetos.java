package edu.faminasbh.ltp2.slides.classes;

public class ExObjetos {
	public static void main(String[] args) {
		Pessoa fulano =  new Pessoa();
		fulano.nome = "Fulano de Tal";
		fulano.idade = 22;
		fulano.anda(); 	
		fulano.dorme();		
		
		System.out.println(53 % 2);
	}
}

class Pessoa{
	public String nome ;
	public int idade ;
	public void anda(){};
	public void come(){};
	public void dorme(){};	
}

class Vazia {}