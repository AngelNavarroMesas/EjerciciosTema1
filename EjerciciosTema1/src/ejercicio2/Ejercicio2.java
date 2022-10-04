package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables para este ejercicio
		int num, multiplo;
		
		//Le pedimos al usuario que introduzca un numero y usamos el escaner para darle ese valor a la variable
		System.out.println("Introduzca un numero");
		num = sc.nextInt();
		
		//con esta operacion descubriremos si el numero es multiplo de 7
		num%=7;
		
		
		multiplo = num==0?num: 7-num;
		
		//Mostramos el resultado al usuario
		System.out.println("hay que sumarle "+ (multiplo) + " para que sea multiplo de 7");
		
		sc.close();
	}

}
