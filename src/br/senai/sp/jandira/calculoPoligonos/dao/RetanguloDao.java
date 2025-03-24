package br.senai.sp.jandira.calculoPoligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculoPoligonos.model.Retangulo;
import br.senai.sp.jandira.calculoPoligonos.ui.Menu;

public class RetanguloDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um retângulo...");
		
		Retangulo retangulo = new  Retangulo();
		
		System.out.println("Digite a altura do retângulo: ");
		retangulo.setAltura(leitor.nextDouble());
		
		System.out.println("Digite a base do retângulo: ");
		retangulo.setBase(leitor.nextDouble());
		
		
		retangulo.exibirDados();
		
		
		
		Menu.retornar();
		
		
		
	}
}
