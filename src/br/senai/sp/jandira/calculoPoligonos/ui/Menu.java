package br.senai.sp.jandira.calculoPoligonos.ui;

import java.util.Scanner;

import br.senai.sp.jandira.calculoPoligonos.dao.CircunferenciaDao;
import br.senai.sp.jandira.calculoPoligonos.dao.QuadradoDao;
import br.senai.sp.jandira.calculoPoligonos.dao.RetanguloDao;
import br.senai.sp.jandira.calculoPoligonos.dao.TrapezioDao;
import br.senai.sp.jandira.calculoPoligonos.dao.TrianguloDao;

public class Menu {
	
	static Scanner leitor = new Scanner(System.in);

	public static void criarMenu() {

		

		System.out.println("---------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("---------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÂNGULO");
		System.out.println("3 - TRIÂNGULO");
		System.out.println("4 - TRAPÉZIO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("6 - SAIR");
		System.out.println("---------------------");
		System.out.print("Escolha uma opção (1-6): ");

		int opcao = leitor.nextInt();

		if (opcao == 1) {
			QuadradoDao.criar();
		} else if (opcao == 2) {
			RetanguloDao.criar();
		} else if (opcao == 3) {
			TrianguloDao.criar();
		} else if (opcao == 4) {
			TrapezioDao.criar();
		} else if (opcao == 5) {
			CircunferenciaDao.criar();
		} else if (opcao == 6) {
			System.out.println("Encerrando o programa. Bye!");
			System.exit(0);
		} else {
			System.out.println("Opção inválida! Você deve escolher um número entre 1 e 6!");
			criarMenu();
		}

	}

	public static void retornar() {
		// Perguntar ao usuário se ele deseja escolher outra forma
		System.out.println("Digite qualquer tecla e pressione ENTER para continuar...");

		leitor.next();

		criarMenu();

	}

}
