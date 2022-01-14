package entidades;

import entidades.enums.Color;

public class Rectangulo extends Forma{
	private double largura;
	private double altura;
	
	public Rectangulo() {
	}

	public Rectangulo(Color color, double largura, double altura) {
		super(color);
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return largura * altura;
	}
}
