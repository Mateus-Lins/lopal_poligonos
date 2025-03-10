package br.senai.sp.jandira.calculoPoligonos.model;

public class Trapezio {
	
	private double baseMaior;
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	private double baseMenor;
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	private double altura;
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = ((baseMaior + baseMenor) * altura)/2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("---------------------");
		System.out.println("DADOS DO TRAPEZIO");
		System.out.println("---------------------");
		System.out.println("Tamanho da base: " + baseMaior);
		System.out.println("Tamanho da base: " + baseMenor);
		System.out.println("Tamanho do altura: " + altura);
		System.out.println("Área total: " + calcularArea());
		System.out.println("---------------------");
	}


}
