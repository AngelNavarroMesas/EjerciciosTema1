package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double infantil, adulto, total;
		
		System.out.println("Introduzca la cantidad de entradas infantiles que quiera comprar");
		infantil = sc.nextDouble();
		
		System.out.println("Introduzca la cantidad de entradas de adulto que quiera comprar");
		adulto = sc.nextDouble();
		
		infantil *= 15.50;
		adulto *= 20;
		total = infantil+adulto;
		
		total = total >=100? total*=0.95: total;
		
		
		System.out.println("tiene que pagar " +total+"€");
		
		sc.close();
	}

}
