package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.println("Introduzca la base del triangulo");
		base =sc.nextDouble();
		System.out.println("Introduzca la altura del triangulo");
		altura =sc.nextDouble();
		
		area= (base*altura)/2;
		
		System.out.println("El area del triangulo es "+area);
		
		sc.close();
	}

}
