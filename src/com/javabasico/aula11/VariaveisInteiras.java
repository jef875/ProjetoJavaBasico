package com.javabasico.aula11;
import java.util.Scanner;
public class VariaveisInteiras {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
	/*	byte idade01 = 20;
		short idade02 = 30;
		int idade03 = 40;
		long idade04 = 50;
		*/
		System.out.println("Digite seu nome");
		String nome = scan.nextLine();
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		
		System.out.println("Olá "+nome+", você tem "+idade+" anos");
//		System.out.println("idae 02 é "+idade02);
//		System.out.println("idae 03 é "+idade03);
//		System.out.println("idae 04 é "+idade04);

	}

}
