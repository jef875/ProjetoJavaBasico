package com.javabasico.aula17;

import java.util.Scanner;

public class LoopsFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		
		do {
			System.out.println("Digite uma nota válida");
			double nota = scan.nextDouble();
		if(nota >= 0 && nota <= 10) {
			notaValida = true;
			System.out.println("Nota "+nota);
			
		}else {
			System.out.println("Nota inválida");
		}
		}while(!notaValida); 
		
  }
}
