package com.javabasico.aula17;

import java.util.Scanner;

public class ValdaInformacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite um nome com mais de três letras");
		String nome = scan.nextLine();
		if(nome.length()< 3) {
			System.out.println("O nome deve ter mais de três caracteres");
		}else
		
		System.out.println("Digite uma idade entre 0 e 150");
		int idade = scan.nextInt();
		if(idade < 0 && idade > 150) {
			System.out.println("A idade tem que ser entre 0 e 150");
		}else
		
		System.out.println("Digite um slário maior que 0");
		double salario = scan.nextDouble();
		if(salario< 0 ) {
			System.out.println("O salario deve ser maior que 0 (Zero)");
		}else
		
		System.out.println("Digite M para masculino e F para feminino");
		String sexo = scan.nextLine();
		if(sexo.length()> 1) {
			System.out.println("Digite apena M ou F");
		}else if(sexo.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		}else if(sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		}
		
		System.out.println("Estado civil S- solteiro, C- casado, V- viuvo, D- divorciado");
		String estadoCivil = scan.nextLine();
		
		System.out.println(sexo+" "+nome+" "+idade+" "+salario+" "+estadoCivil);
	}

}
