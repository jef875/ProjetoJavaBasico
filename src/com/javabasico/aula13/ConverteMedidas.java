package com.javabasico.aula13;

import java.util.Scanner;

public class ConverteMedidas {
		
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite uma medida em metros");
		double medida = scan.nextDouble();
		double convertido = medida * 100;
		System.out.println("A medida em centímetros é: "+convertido+" centímetros");
	}

}
