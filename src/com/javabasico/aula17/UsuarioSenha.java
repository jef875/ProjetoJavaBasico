package com.javabasico.aula17;

import java.util.Scanner;

public class UsuarioSenha {

	private static Scanner scan;

	public static void main(String[] args) {

		boolean valido = false;
		scan = new Scanner(System.in);
		String nome, sexo, civil;
		int idade;
		double salario;

		do {
			System.out.println("Digite o nome de usuário");
			nome = scan.next();
			valido = true;
			if (nome.length() >= 3) {
				System.out.println("nome válido: " + nome);
			} else {
				System.out.println(" NOME inválido, precisa conter no mínimo 3 caracteres");
				valido = false;
			}
		} while (!valido);

		do {
			System.out.println("Digite uma idade de zero a cento e cinquenta");
			idade = scan.nextInt();
			valido = true;
			if (idade >= 0 && idade <= 150) {
				System.out.println("idade válida: " + idade);
			} else {
				System.out.println("A idade deve ser de 0 a 150 anos");
				valido = false;
			}
		} while (!valido);

		do {
			System.out.println("Digite seu salário");
			salario = scan.nextDouble();
			valido = true;
			if (salario > 0) {
				System.out.println("salário: " + salario);

			} else {
				System.out.println("Salário inválido");
				valido = false;
			}

		} while (!valido);
		
		do {
			System.out.println("digite o seu sexo");
			System.out.println("M- masculino F- feminino");
			sexo = scan.nextLine();
	     	valido = true;
			if(sexo.equalsIgnoreCase("M")) {
				System.out.println("Masculino");
			}else if(sexo.equalsIgnoreCase("F")) {
				System.out.println("Sexo feminino" );
			}else{
				
				System.out.println("Sexo inválido");
				valido = false;
			}
			
		} while(!valido);
		
		do {
			System.out.println("Digite seu estado civil");
			System.out.println("C- casado(a) S- solteiro(a) D- divorciado(a) V- viúvo \n");
			civil = scan.nextLine();
			valido = true;
			if(civil.equalsIgnoreCase("C")) {
				System.out.println("CASADO");
			}else if(civil.equalsIgnoreCase("S")) {
				System.out.println("SOLTEIRO");
			}else if(civil.equalsIgnoreCase("D")) {
				System.out.println("DIVORCIADO");
			}else if(civil.equalsIgnoreCase("V")) {
				System.out.println("VIÚVO");
			}else {
				System.out.println("sexo inválido");
			}
			
		}while(!valido);
		System.out.println("SEXO: "        +sexo);
		System.out.println("NOME: "        +nome);
		System.out.println("IDADE: "       +idade);
		System.out.println("SALÁRIO: "     +salario);
		System.out.println("ESTADI CIVIL: "+civil);
		
	}

}