package com.javabasico.aula13;

import java.util.Scanner;

public class HoraTrabalho {

	private static Scanner scan2;

	public static void main(String[] args) {
		scan2 = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora? ");
		double ganha = scan2.nextDouble();
		System.out.println("Quantas horas você trabalhou neste mês?");
		double horasTrabalhadas = scan2.nextDouble();

		double salario = ganha * horasTrabalhadas;
		System.out.println("Seu salário equivalente às horas trabalhadas " + "neste mês será de: " + salario + " reais");
	}

}
