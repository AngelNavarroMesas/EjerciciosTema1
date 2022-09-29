package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, multiplo, num2;
		
		System.out.println("Introduzca un numero");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro numero");
		num2 = sc.nextInt();

		num1%=num2;
		
		multiplo = num1==0?num1: num2-num1;
		
		System.out.println("hay que sumarle "+ multiplo + " para que sea multiplo de "+ num2);
		
		sc.close();
	}

}
