package br.senai.sp.jandira.calculoPoligonos;

import java.util.Scanner;

import br.senai.sp.jandira.calculoPoligonos.ui.Menu;


public class CalculoPoligonos {

	public static void main(String[] args) {
		
		// Looping / laços de repetição
		
		System.out.println("Tabuada do 9");
		int resultado = 1;
		int contador = 0;
		while(contador <=10) {
			//System.out.println("SENAI JANDIRA! - " + contador );
			resultado = contador * 9;
			System.out.println(contador + " X 9 = " + resultado);
			contador = contador + 1;
			
					
		}
		
		//String resposta = "s";
		//while (resposta.equals("s")) {
			//System.out.println("Estamos dando voltas");
		//	System.out.println("Gostaria de dar mais uma volta (s/n)?");
			//Scanner leitor = new Scanner(System.in);
			//resposta = leitor.next();
		//}
		
		
		
		
		//Menu.criarMenu();		
	}
	
	

}
