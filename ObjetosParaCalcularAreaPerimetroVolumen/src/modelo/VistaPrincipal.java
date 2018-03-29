package modelo;

import java.util.Scanner;

public class VistaPrincipal {
	
	public static double lado;
	public static String num;
	public static ObjetoCubo cubo;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String primeraOpcion = "";
		int segundaOpcion = 0;
		lado = 0;
		cubo = new ObjetoCubo();
		num = "";
		
			System.out.print("�Cu�l es la medida del lado? ");
			num = scanner.nextLine();
			lado = Double.parseDouble(num);
			cubo.setLado(lado);
			do {
				System.out.println("****Elija una opcion****"
						+ "\n1.-Perimetro"
						+ "\n2.-Area"
						+ "\n3.-Volumen"
						+ "\n4.-Cancelar"
						+ "\n5.-Salir");
				primeraOpcion = scanner.nextLine();
				segundaOpcion = Integer.parseInt(primeraOpcion);
				switch (segundaOpcion) {
				case 1:
					System.out.println("Perimetro de la figura es: "+cubo.perimetro());
					auxMenu();
					break;
				case 2:
					System.out.println("Area de la figura es: "+cubo.area());
					auxMenu();
					break;
				case 3:
					System.out.println("Volumen de la figura es: "+cubo.calcularVolumen());
					auxMenu();
					break;
				case 4:
					System.out.println("�Cu�l es la nueva medida del lado? ");
					num = scanner.nextLine();
					lado = Double.parseDouble(num);
					cubo.setLado(lado);
					break;
				case 5:
					System.out.println("Salio del programa");
					break;
				default:
					System.out.println("Elige una opcion valida");
					break;
				}
			} while (segundaOpcion!=5);
						
			
		
	}
	
	public static void auxMenu() {
		Scanner scanner = new Scanner(System.in);
		String opc = "";
		int aux = 0;
		do {
			System.out.println("****Elija una opcion****"
					+ "\n1.-Volver al menu principal"
					+ "\n2.-Nueva medida para el lado");
			opc = scanner.nextLine();
			aux = Integer.parseInt(opc);
			switch (aux) {
			case 2:
				System.out.print("�Cu�l es la nueva medida del lado? ");
				num = scanner.nextLine();
				lado = Double.parseDouble(num);
				cubo.setLado(lado);
				break;

			default:
				System.out.println("Elige una opcion valida");
				break;
			}
		} while(aux!=2 && aux!=1);
	}

}
