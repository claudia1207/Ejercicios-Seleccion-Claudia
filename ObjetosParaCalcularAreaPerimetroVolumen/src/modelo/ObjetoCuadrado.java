package modelo;

public class ObjetoCuadrado {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double area() {
		return lado*lado;
	}
	
	public double perimetro() {
		return lado*4;
	}

}
