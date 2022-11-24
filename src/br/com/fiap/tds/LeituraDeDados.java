package br.com.fiap.tds;

import java.util.Scanner;

public class LeituraDeDados {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Idade: ");
		int idade=sc.nextInt();
		System.out.println("Idade digitada: "+idade);
		sc.close();
	}
}
