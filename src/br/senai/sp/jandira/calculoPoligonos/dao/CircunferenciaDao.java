package br.senai.sp.jandira.calculoPoligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculoPoligonos.model.Circunferencia;

public class CircunferenciaDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando uma circunferência...");
		
		Circunferencia circunferencia1 = new  Circunferencia();
		
		System.out.println("Digite o valor do raio: ");
		
		
		
		circunferencia1.setRaio(leitor.nextDouble());
		circunferencia1.exibirDados();
		
	}

}
	
