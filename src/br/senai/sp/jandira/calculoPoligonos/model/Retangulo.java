package br.senai.sp.jandira.calculoPoligonos.model;

public class Retangulo {
	private double base;
	public void setBase(double base) {
		this.base = base;
	}
	
	private double altura;
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * base + 2 * altura;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("---------------------");
		System.out.println("DADOS DO RETANGULO");
		System.out.println("---------------------");
		System.out.println("Tamanho da base: " + base);
		System.out.println("Tamanho do altura: " + altura);
		System.out.println("Área total: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());
		System.out.println("---------------------");
	}
}
