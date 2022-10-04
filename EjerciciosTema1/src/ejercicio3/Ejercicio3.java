package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables para este ejercicio
		int num1, multiplo, num2;
		
		//Le pedimos al usuario que introduzca dos numeros y usamos el escaner para darle ese valor a las variables
		System.out.println("Introduzca un numero");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro numero");
		num2 = sc.nextInt();
		
		//Aqui calculamos si el primer numero es multiplo del segundo
		num1%=num2;
		
		multiplo = num1==0?num1: num2-num1;
		
		
		//Mostramos el resultado al usuario
		System.out.println("hay que sumarle "+ multiplo + " para que sea multiplo de "+ num2);
		
		sc.close();
	}

}
