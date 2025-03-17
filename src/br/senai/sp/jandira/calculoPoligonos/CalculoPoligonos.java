package br.senai.sp.jandira.calculoPoligonos;
import java.util.Scanner;

import br.senai.sp.jandira.calculoPoligonos.model.Circunferencia;
import br.senai.sp.jandira.calculoPoligonos.model.Quadrado;
import br.senai.sp.jandira.calculoPoligonos.model.Retangulo;
import br.senai.sp.jandira.calculoPoligonos.model.Trapezio;
import br.senai.sp.jandira.calculoPoligonos.model.Triangulo;
import br.senai.sp.jandira.calculoPoligonos.ui.Menu;


public class CalculoPoligonos {

	public static void main(String[] args) {
		
		Menu.criarMenu();
		
//		Scanner leitor = new Scanner(System.in);
//		
//		System.out.print("digite o valor do lado do quadrado: ");
//		double lado = leitor.nextDouble();
//		leitor.nextLine();
//		
//		System.out.println("Qual é o seu nome?");
//		String nome = leitor.nextLine();
//		
//		System.out.println("Olá, " + nome);
//		
//		Quadrado quadrado1 = new Quadrado();
//		quadrado1.setLado(lado);
//		quadrado1.exibirDados();
		
//		Retangulo retangulo1 = new Retangulo();
//		retangulo1.setBase(8);
//		retangulo1.setAltura(40);
//		retangulo1.exibirDados ();
//		
//		Triangulo triangulo1 = new Triangulo();
//		triangulo1.setBase(10);
//		triangulo1.setAltura(20);
//		triangulo1.exibirDados();
//		
//		Trapezio trapezio1 = new Trapezio();
//		trapezio1.setBaseMaior(13);
//		trapezio1.setBaseMenor(3);
//		trapezio1.setAltura(2);
//		trapezio1.exibirDados();
//		
		Circunferencia circunferencia1 = new Circunferencia ();
		circunferencia1.setRaio(2);
		circunferencia1.exibirDados();
//
	}
	
	

}
