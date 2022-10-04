package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		double infantil, adulto, total;
		
		//Pedimos al usuario que introduzca el numero de entradas que desea comprar
		System.out.println("Introduzca la cantidad de entradas infantiles que quiera comprar");
		infantil = sc.nextDouble();
		System.out.println("Introduzca la cantidad de entradas de adulto que quiera comprar");
		adulto = sc.nextDouble();
		
		//Calculamos cual seria el dinero total
		infantil *= 15.50;
		adulto *= 20;
		total = infantil+adulto;
		
		total = total >=100? total*=0.95: total;
		
		//Mostramos el resultado
		System.out.println("tiene que pagar " +total+"€");
		
		sc.close();
	}

}
