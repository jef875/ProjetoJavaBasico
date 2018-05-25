package com.javabasico.aula13;

import java.util.Scanner;

public class MostraNumeros {

	private static Scanner scan;

	public static void main(String[] args) {
		
		
		scan = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = scan.nextInt();
		System.out.println("O número digitado foi "+num);
	}

}
