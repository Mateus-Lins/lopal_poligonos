package br.senai.sp.jandira.calculoPoligonos.dao;

import java.util.Scanner;
import br.senai.sp.jandira.calculoPoligonos.model.Trapezio;

public class TrapezioDao {

		
		public static void criar() {
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Criando um trapézio...");
			
			Trapezio trapezio = new  Trapezio();
			
			System.out.println("Digite a altura do trapézio: ");
			
			System.out.println("Digite a base menor do trapézio: ");
			
			System.out.println("Digite a base maior do trapézio: ");
			
			trapezio.setAltura(leitor.nextDouble());
			trapezio.setBaseMenor(leitor.nextDouble());
			trapezio.setBaseMaior(leitor.nextDouble());
			trapezio.exibirDados();
			
		}
	
}
