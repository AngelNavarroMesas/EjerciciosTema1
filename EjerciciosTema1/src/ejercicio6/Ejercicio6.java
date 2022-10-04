package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int seg, min, horas;
		
		//Pedimos al usuario que introduzca un numero de segundos
		System.out.println("Introduzca un numero de segundos");
		seg= sc.nextInt();
		
		//Pasamos los segundos a minutos y horas
		min= seg/60;
		seg%=60;
		horas= min/60;
		min%=60;
		
		//Mostramos el resultado
		System.out.println("El numero de segundos introducidos equivale a "+horas+" horas, "+min+" minutos y "+seg+" segundos");
		
		sc.close();
	}

}
