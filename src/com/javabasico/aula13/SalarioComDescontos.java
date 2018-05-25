package com.javabasico.aula13;

import java.util.Scanner;

public class SalarioComDescontos {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora? ");
		double ganha = scan.nextDouble();
		System.out.println("Quantas horas você trabalhou neste mês?");
		double horasTrabalhadas = scan.nextDouble();
		double salarioBruto = ganha * horasTrabalhadas;
		double ir = (salarioBruto / 100) * 11;
		double sindicato = (salarioBruto / 100) * 5;
		double inss = (salarioBruto / 100) * 8;
		double totalDescontos = inss + ir + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Seu salário Bruto é: " + salarioBruto + " reais");
		System.out.println("Seu salário líquido é: " + salarioLiquido + " reais");
		System.out.println("Sindicato: "+sindicato);
		System.out.println("INSS: "+inss);
		System.out.println("IR: "+ir);

	}

}
