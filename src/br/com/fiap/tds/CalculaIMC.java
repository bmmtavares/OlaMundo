package br.com.fiap.tds;

import java.util.Scanner;

public class CalculaIMC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----##### Programa Calcula IMC #####-----");
		
		System.out.println("Informe a altura: ");
		float altura= sc.nextFloat();
		
		System.out.println("Informe o peso: ");
		float peso=sc.nextFloat();
		
		sc.close();
		
		float imc = peso / (altura * altura);
		System.out.println("Resultado IMC: "+imc);
		
		if(imc >=18.5 && imc<=25) {
			System.out.println("Peso é ideal!");
		}else {
			System.out.println("Está fora do peso normal!");
		}
		
	}
}
