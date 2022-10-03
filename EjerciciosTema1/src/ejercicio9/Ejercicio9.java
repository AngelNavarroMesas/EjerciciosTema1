package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		boolean iguales;
		
		
		System.out.println("introduzca dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		iguales = num1==num2;
		
		System.out.println("Los numeros son iguales? " +iguales);
		
		sc.close();
	}

}
