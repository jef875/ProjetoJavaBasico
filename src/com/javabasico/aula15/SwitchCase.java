package com.javabasico.aula15;

import java.util.Scanner;

public class SwitchCase {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("digite um número do dia da semana");
		
		int semana = scan.nextInt();
		switch (semana) {
		case 1: System.out.println("Domingo"); 
		break;
		case 2: System.out.println("Segunda-feira");
		break;
		case 3: System.out.println("Terça-feira");
		break;
		case 4: System.out.println("Quarta-feira");
		break;
		case 5: System.out.println("Qinta-feira");
		break;
		case 6: System.out.println("Sexta-feira");
		break;
		case 7: System.out.println("Sábado");
		break;
		default: System.out.println("Dia inválido");
		
		
		}
	}

}
