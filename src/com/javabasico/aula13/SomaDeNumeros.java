package com.javabasico.aula13;

import java.util.Scanner;

public class SomaDeNumeros {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		System.out.println("digite outro número");
		int num2 = scan.nextInt();
		int soma = num + num2;
		System.out.println("A soma dos números é: "+soma);
		
	}

}
