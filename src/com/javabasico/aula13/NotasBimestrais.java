package com.javabasico.aula13;

import java.util.Scanner;

public class NotasBimestrais {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Nota 1");
		double nota1 = scan.nextDouble();
		System.out.println("Nota 2");
		double nota2 = scan.nextDouble();
		System.out.println("Nota 3");
		double nota3 = scan.nextDouble();
		System.out.println("Nota 4");
		double nota4 = scan.nextDouble();
		
		double soma = nota1 + nota2 + nota3 + nota4;
		double media = soma/4;
		
		System.out.println("A soma da notas é: "+soma+" e a média é: "+media );
		
		if(media >= 7) {
			System.out.println("você passou");
		}
		else {
			System.out.println("Você não passou");
		}
	}

}
