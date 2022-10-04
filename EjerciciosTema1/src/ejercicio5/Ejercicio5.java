package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int y, x, a, b, c;
		
		//Pedimos al usuario que le de valor a las variables
		System.out.println("Introduzca el valor de x");
		x= sc.nextInt();
		System.out.println("Introduzca el valor de a");
		a= sc.nextInt();
		System.out.println("Introduzca el valor de b");
		b= sc.nextInt();
		System.out.println("Introduzca el valor de c");
		c= sc.nextInt();
		
		//Hacemos los calculos para averiguar y
		y= a*(x*x)+b*x+c;
		
		//Mostramos el resultado
		System.out.println("El valor de y es: "+y);
		
		sc.close();
	}

}
