package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable para este ejercicio
		double num;
		
		//Le pedimos al usuario que introduzca un numero y usamos el escaner par darle ese valor a la variable
		System.out.println("Introduzca un numero con decimales");
		num = sc.nextDouble();
		
		//Esta operacion nos permite redondear el numero sin usar Math.pow
		num +=0.5;
		
		//Mostramos al usuario el redondeo del numero que ha introducido
		System.out.println("numero redondeado " +(int)num);
		
		sc.close();
	}

}
