package com.javabasico.aula17;

import java.util.Scanner;

public class Validar {

	private static Scanner scan;

	public static void main(String[] args) {

		boolean valido = false;
		scan = new Scanner(System.in);
		String nome, sexo, civil;
		int idade;
		double salario;

		do {
			System.out.println("Digite seu nome");
			nome = scan.next();
			valido = true;
			if (nome.length() < 3) {
				
			System.out.println(" NOME inválido, precisa conter no mínimo 3 caracteres");
			valido = false;
				}
		} while (!valido);

		valido = false;
		do {
			System.out.println("Digite uma idade de zero a cento e cinquenta");
			idade = scan.nextInt();
			valido = true;
			if (idade < 0 && idade > 150) {
				System.out.println("A idade deve ser de 0 a 150 anos");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.println("Digite seu salário");
			salario = scan.nextDouble();
			valido = true;
			if (salario < 0) {
				System.out.println("Salário inválido");

				valido = false;
			}

		} while (!valido);

		valido = false;
		do {
			System.out.println("digite o seu sexo ");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
				valido = true;
			} else {
				System.out.println("Sexo inválido, precisa ser F ou M");
				valido = false;
			}

		} while (!valido);

		valido = false;
		do {
			System.out.println("Digite seu estado civil");
			civil = scan.next();

			if (civil.equalsIgnoreCase("C") || civil.equalsIgnoreCase("S") || civil.equalsIgnoreCase("D")
					|| civil.equalsIgnoreCase("V")) {
				valido = true;
			} else {
				System.out.println("INVÁLIDO, ENTRE COM 'C,S,D OU V': ");
				valido = false;
			}

		} while (!valido);
		System.out.println("DADOS COLETADOS");
		System.out.println("SEXO: " + sexo);
		System.out.println("NOME: " + nome);
		System.out.println("IDADE: " + idade);
		System.out.println("SALÁRIO: " + salario);
		System.out.println("ESTADO CIVIL: " + civil);
	}
}