package br.senai.sp.jandira.calculoPoligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculoPoligonos.model.Triangulo;
import br.senai.sp.jandira.calculoPoligonos.ui.Menu;

public class TrianguloDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um triângulo...");
		
		Triangulo triangulo = new  Triangulo();
		
		System.out.println("Digite a altura do triângulo: ");
		triangulo.setAltura(leitor.nextDouble());
		
		System.out.println("Digite a base do triângulo: ");
		triangulo.setBase(leitor.nextDouble());
		
		
		triangulo.exibirDados();
		
		Menu.retornar();
		
	}
	
}
