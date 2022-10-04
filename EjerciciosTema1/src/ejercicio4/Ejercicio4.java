package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		double base, altura, area;
		
		//Le pedimos al usuario que introduzca el valor de la base y la altura
		System.out.println("Introduzca la base del triangulo");
		base =sc.nextDouble();
		System.out.println("Introduzca la altura del triangulo");
		altura =sc.nextDouble();
		
		//Calculamos el area del triangulo
		area= (base*altura)/2;
		
		//Mostramos el resultado
		System.out.println("El area del triangulo es "+area);
		
		sc.close();
	}

}
