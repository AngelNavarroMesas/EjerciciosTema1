package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Introduzca un numero con decimales");
		num = sc.nextDouble();
		
		num +=0.5;
		
		System.out.println("numero redondeado " +(int)num);
		
		sc.close();
	}

}
