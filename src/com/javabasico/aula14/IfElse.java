package com.javabasico.aula14;

import java.util.Scanner;

public class IfElse {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Entre com o preço do item");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Item barato");
		}
		else if (valor > 10 && valor <= 15){
			System.out.println("Peça um desconto");
		}
		else if (valor > 15 && valor <= 17) {
			System.out.println("O item está caro, pesquise mais um pouco");
		}
		else if(valor > 17) {
			System.out.println("Item extremamente caro, você mora no Brasil!");
		}
	}

}
