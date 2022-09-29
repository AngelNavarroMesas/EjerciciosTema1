package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, x, a, b, c;
		
		System.out.println("Introduzca el valor de x");
		x= sc.nextInt();
		System.out.println("Introduzca el valor de a");
		a= sc.nextInt();
		System.out.println("Introduzca el valor de b");
		b= sc.nextInt();
		System.out.println("Introduzca el valor de c");
		c= sc.nextInt();
		
		y= a*(x*x)+b*x+c;
		
		System.out.println("El valor de y es: "+y);
		
		sc.close();
	}

}
