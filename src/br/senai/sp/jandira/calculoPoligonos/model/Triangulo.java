package br.senai.sp.jandira.calculoPoligonos.model;

public class Triangulo {
	
	private double base;
	public void setBase(double base) {
		this.base = base;
	}
	
	private double altura;
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = (base * altura)/2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("---------------------");
		System.out.println("DADOS DO TRIANGULO");
		System.out.println("---------------------");
		System.out.println("Tamanho da base: " + base);
		System.out.println("Tamanho do altura: " + altura);
		System.out.println("Área total: " + calcularArea());
		System.out.println("---------------------");
	}

}
