package modelo;

public class ObjetoCubo extends ObjetoCuadrado{
	
	public double calcularVolumen() {
		return getLado()*getLado()*getLado();
	}
	

}
