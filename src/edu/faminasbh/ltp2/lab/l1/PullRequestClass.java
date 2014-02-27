package edu.faminasbh.ltp2.lab.l1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PullRequestClass {
	
	private static MessageDigest md5;
	private static MessageDigest sha256;
	
	
	// Esse é um inicializador estático da CLASSE
	static {
		//Tenta executar um bloco de código com cuidado
		//sabe-se que pode ocorrer um problema dentro do bloco de código a
		// seguir!
		try {
			// Cria instancias dos MessageDigest que implementam os respectivos
			// algoritmos
			md5 = MessageDigest.getInstance("MD5");
			sha256 = MessageDigest.getInstance("SHA-256");
		// Se acontecer um problema (exception)  do tipo NoSuchAlgorithmException
		// eu vou executar o próximo bloco de código
		} catch (NoSuchAlgorithmException e) {
			// Imprime a pilha da procedimentos da exceção
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Esta é uma classe apenas para testar o Pull Request
		String nome = "Charles Ferreira Gonçalves";
		// Esse é o md5 gerado do MEU nome acima, aqui vcs terao que atualizar o campo!
		String md5doNome = "d713e13beb1236cdcd16da018657f944";
		// Quero que coloquem o código do nome de vocês, nada mais no código ...
		String sha256doNome = "636218279c3e5cb211713f86e94651acfbe81337f53bb105aa684e6f85d35d08";
				
		System.out.print("O md5 do nome:    '" + nome + "' é : ");
		System.out.println(md5doNome);
				
		System.out.print("O sha256 do nome: '" + nome + "' é : ");
		System.out.println(sha256doNome);

	}
	
	// Método que gera uma representação de um nome a partir de um algoritmo
	// de digesting, entendam o contrato
	private static String geraHash(String nome, MessageDigest algorithm) {
		StringBuffer sb = null;
        try {            
            byte[] array = algorithm.digest(nome.getBytes("UTF-8"));
            sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }            
        } catch (Exception e) {
        	e.printStackTrace();        	
        }
        return sb.toString();
    }

}
