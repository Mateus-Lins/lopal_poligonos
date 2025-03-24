package br.senai.sp.jandira.calculoPoligonos.dao;

import java.util.Scanner;
import br.senai.sp.jandira.calculoPoligonos.model.Trapezio;
import br.senai.sp.jandira.calculoPoligonos.ui.Menu;

public class TrapezioDao {

		
		public static void criar() {
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Criando um trapézio...");
			
			Trapezio trapezio = new  Trapezio();
			
			System.out.println("Digite a altura do trapézio: ");
			trapezio.setAltura(leitor.nextDouble());
			
			System.out.println("Digite a base menor do trapézio: ");
			trapezio.setBaseMenor(leitor.nextDouble());
			
			System.out.println("Digite a base maior do trapézio: ");
			trapezio.setBaseMaior(leitor.nextDouble());
			
			
			
			trapezio.exibirDados();
			
			Menu.retornar();
			
		}
	
}
