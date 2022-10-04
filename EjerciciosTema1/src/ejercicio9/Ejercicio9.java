package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num1, num2;
		boolean iguales;
		
		//Pedimos al usuaro que nos indique los dos numeros que desea comprobar
		System.out.println("introduzca dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//Comprobamos si son iguales
		iguales = num1==num2;
		
		//Mostramos el resultado
		System.out.println("Los numeros son iguales? " +iguales);
		
		sc.close();
	}

}
