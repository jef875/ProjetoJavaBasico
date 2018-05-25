package com.javabasico.aula15;

import java.util.Scanner;

public class VogalConsoante {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Digite uma letra");

		String letra = scan.nextLine();
		if (letra.length() > 1) {
			System.out.println("Letra inválida");
		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
			}
		}
	}

}
