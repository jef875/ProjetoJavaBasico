package com.javabasico.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
/**		System.out.println("digite seu nome completo");
		String nomeCompleto = scan.nextLine();
//		System.out.println("Seu nome completo é: "+nomeCompleto);
		
		System.out.println("Digite seu primeiro nome");
		String primeiroNome = scan.nextLine();
//		System.out.println("Seu primeiro nome é: "+primeiroNome);
		
		System.out.println("Digite a sua idade");
		int idade = scan.nextInt();
//		System.out.println("Sua idade é: "+idade);
		
		System.out.println("Olá "+primeiroNome+", sua idade é: "+idade);
		**/
		
		System.out.println("Digite seu nome, idade,  quatidade de filhos e se tem bichinho de estimação");
		String nome = scan.next();
		int idade = scan.nextInt();
		byte quantidadeFilhos = scan.nextByte();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Olá "+nome+"; você tem "+idade+" anos e "+quantidadeFilhos+" filhos e tem bichinho de estimação: "+temPet);
	}

}
