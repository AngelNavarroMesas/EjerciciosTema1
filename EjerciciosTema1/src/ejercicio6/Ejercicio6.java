package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seg, min, horas;
		
		System.out.println("Introduzca un numero de segundos");
		seg= sc.nextInt();
		
		min= seg/60;
		seg%=60;
		horas= min/60;
		min%=60;
		
		System.out.println("El numero de segundos introducidos equivale a "+horas+" horas, "+min+" minutos y "+seg+" segundos");
	}

}
