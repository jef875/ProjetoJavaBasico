package com.javabasico.aula13;
import java.util.Scanner;
public class CalculaAreaQuadrado {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite a altura");
		double altura = scan.nextDouble();
		System.out.println("digite a largura");
		double largura = scan.nextDouble();
		double area = altura * largura;
		double DobroArea = area * 2;
		System.out.println("A área é: "+area+" e o dobro da área é: "+DobroArea);

	}

}
