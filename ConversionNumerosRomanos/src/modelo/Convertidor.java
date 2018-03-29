package modelo;

import java.util.Scanner;

public class Convertidor {
	
	public static void main(String args[]) {
		String entrada = "";
		String conversion = "";
		int aux = 0;
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
			System.out.print("Ingrese un numero a convertir:  ");
			entrada = scanner.nextLine();
			entrada = entrada.trim();
			try {
				numero = Integer.parseInt(entrada);
				if(numero>0  && numero<=1000){
					aux = entrada.length();
					switch (aux) {
					case 1:
						entrada = "00"+entrada;
						break;
					case 2:
						entrada = "0"+entrada;
						break;
					default:
						break;
					}
					
					if(numero==1000) {
					 System.out.println("La conversion es: M");
					}else {
						conversion += centenas(entrada.charAt(0));
						conversion += decenas(entrada.charAt(1));
						conversion += unidades(entrada.charAt(2));
						System.out.println("La conversion es: "+conversion);
					}
				}else {
					System.out.println("Numeros que esten entre 1 y 5000");
				}
			} catch (Exception e) {
				System.out.println("Ingresa un numero");
			}
		
		
		
	}
	
	
	public static String unidades(char numero) {
		String salida = "";
		switch (numero) {
		case '1':
			salida = "I";
			break;
		case '2':
			salida = "II";
			break;
		case '3':
			salida = "III";
			break;
		case '4':
			salida = "IV";
			break;
		case '5':
			salida = "V";
			break;
		case '6':
			salida = "VI";
			break;
		case '7':
			salida = "VII";
			break;
		case '8':
			salida = "VIII";
			break;
		case '9':
			salida = "IX";
			break;

		default:
			salida = "";
			break;
		}
		return salida;
	}
	
	public static String decenas(char numero) {
		String salida = "";
		switch (numero) {
		case '1':
			salida = "X";
			break;
		case '2':
			salida = "XX";
			break;
		case '3':
			salida = "XXX";
			break;
		case '4':
			salida = "XL";
			break;
		case '5':
			salida = "L";
			break;
		case '6':
			salida = "LX";
			break;
		case '7':
			salida = "LXX";
			break;
		case '8':
			salida = "LXXX";
			break;
		case '9':
			salida = "XC";
			break;

		default:
			salida = "";
			break;
		}
		return salida;
	}
	
	public static String centenas(char numero) {
		String salida = "";
		switch (numero) {
		case '1':
			salida = "C";
			break;
		case '2':
			salida = "CC";
			break;
		case '3':
			salida = "CCC";
			break;
		case '4':
			salida = "CD";
			break;
		case '5':
			salida = "D";
			break;
		case '6':
			salida = "DC";
			break;
		case '7':
			salida = "DCC";
			break;
		case '8':
			salida = "DCCC";
			break;
		case '9':
			salida = "CM";
			break;

		default:
			salida = "";
			break;
		}
		return salida;
	}

}
